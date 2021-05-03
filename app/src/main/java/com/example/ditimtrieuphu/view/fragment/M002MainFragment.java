package com.example.ditimtrieuphu.view.fragment;

import android.view.View;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.example.ditimtrieuphu.R;
import com.example.ditimtrieuphu.view.OnActionCallBack;
import com.example.ditimtrieuphu.view.viewmodel.MainFragViewModel;
import com.example.ditimtrieuphu.view.viewmodel.MainViewModel;

public class M002MainFragment extends BaseFragment<MainFragViewModel> {
        private OnActionCallBack callBack;

        @Override
        protected void initViews() {

        }

    @Override
    protected Class<MainFragViewModel> getClassViewModel() {
        return MainFragViewModel.class;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.m002_main_fragment;
    }

    public void setCallBack(OnActionCallBack callBack) {
            this.callBack = callBack;
        }

}
