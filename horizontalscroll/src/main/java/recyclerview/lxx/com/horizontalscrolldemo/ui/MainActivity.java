package recyclerview.lxx.com.horizontalscrolldemo.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.github.obsessive.library.smartlayout.SmartTabLayout;
import com.github.obsessive.library.widgets.XViewPager;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import recyclerview.lxx.com.horizontalscrolldemo.R;
import recyclerview.lxx.com.horizontalscrolldemo.adapter.ImagesContainerPagerAdapter;
import recyclerview.lxx.com.horizontalscrolldemo.mode.BaseEntity;

public class MainActivity extends AppCompatActivity {


    @Bind(R.id.fragment_images_pager)
    XViewPager mViewPager;

    @Bind(R.id.fragment_images_tab_smart)
    SmartTabLayout mSmartTabLayout;

    private List<BaseEntity> categoryList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        categoryList = getCommonCategoryList(this);

        if (null != categoryList && !categoryList.isEmpty()) {
            mViewPager.setOffscreenPageLimit(categoryList.size());
            mViewPager.setAdapter(new ImagesContainerPagerAdapter(getSupportFragmentManager(), categoryList));
            mSmartTabLayout.setViewPager(mViewPager);
            mSmartTabLayout.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
                @Override
                public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

                }

                @Override
                public void onPageSelected(int position) {
                    ImagesListFragment fragment = (ImagesListFragment) mViewPager.getAdapter().instantiateItem(mViewPager, position);
                    fragment.onPageSelected(position, categoryList.get(position).getId());
                }

                @Override
                public void onPageScrollStateChanged(int state) {

                }
            });
        }
    }


    public List<BaseEntity> getCommonCategoryList(Context context) {
        List<BaseEntity> resultData = new ArrayList<>();
        String[] imagesCategoryArrayId = context.getResources().getStringArray(R.array.images_category_list_id);
        String[] imagesCategoryArrayName = context.getResources().getStringArray(R.array.images_category_list_name);
        for (int i = 0; i < imagesCategoryArrayId.length; i++) {
            resultData.add(new BaseEntity(imagesCategoryArrayId[i], imagesCategoryArrayName[i]));
        }
//        resultData.add(new BaseEntity(imagesCategoryArrayId[0], imagesCategoryArrayName[0]));
//        resultData.add(new BaseEntity(imagesCategoryArrayId[1], imagesCategoryArrayName[1]));
//        resultData.add(new BaseEntity(imagesCategoryArrayId[2], imagesCategoryArrayName[2]));
//        resultData.add(new BaseEntity(imagesCategoryArrayId[3], imagesCategoryArrayName[3]));
//        resultData.add(new BaseEntity(imagesCategoryArrayId[4], imagesCategoryArrayName[4]));
//        resultData.add(new BaseEntity(imagesCategoryArrayId[5], imagesCategoryArrayName[5]));
        return resultData;
    }

//    @OnClick(R.id.fragment_images_tab_smart)
//    public void onClick() {
//
//    }

}
