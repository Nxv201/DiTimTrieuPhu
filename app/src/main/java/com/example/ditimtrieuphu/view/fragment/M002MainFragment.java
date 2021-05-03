package com.example.ditimtrieuphu.view.fragment;

import com.example.ditimtrieuphu.R;
import com.example.ditimtrieuphu.view.OnActionCallBack;
import com.example.ditimtrieuphu.view.viewmodel.MainFragViewModel;

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
