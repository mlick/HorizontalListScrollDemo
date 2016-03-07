package recyclerview.lxx.com.horizontalscrolldemo.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import recyclerview.lxx.com.horizontalscrolldemo.R;

/**
 * Created by lixiangxin on 2016-03-03.
 */
public class ImagesListFragment extends Fragment {


    /**
     * this variable must be initialized.
     */
    private static String mCurrentImagesCategory = null;

    @Bind(R.id.image_text)
    TextView imageText;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mCurrentImagesCategory = getResources().getStringArray(R.array.images_category_list_id)[0];
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.imagelist_fragment, container, false);
        ButterKnife.bind(this, view);
        // TODO Use fields...
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    public void onPageSelected(int position, String keywords) {
        mCurrentImagesCategory = keywords;
        if (imageText != null) {
            imageText.setText(mCurrentImagesCategory);
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }
}
