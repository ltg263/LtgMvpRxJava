package com.ltg.ltgmvprxjava.mvp;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.lang.reflect.ParameterizedType;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * MVPPlugin
 *  邮箱 784787081@qq.com
 */

public abstract class MVPBaseFragment<V extends BaseView,T extends BasePresenterImpl<V>> extends Fragment implements BaseView{
    public T mPresenter;
    private View mConvertView;
    private Unbinder unbinder;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPresenter= getInstance(this,1);
        mPresenter.attachView((V) this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (setFragmentView() != 0) {
            mConvertView = inflater.inflate(setFragmentView(), container, false);
            unbinder = ButterKnife.bind(this, mConvertView);
            return mConvertView;
        } else {
            return super.onCreateView(inflater, container, savedInstanceState);
        }
    }
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
//        if(loadingDialog==null){
//            loadingDialog = new LoadingDialog(getActivity());
//        }
        initViews();
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        if (mPresenter!=null) {
            mPresenter.detachView();
        }
        unbinder.unbind();
    }

    @Override
    public Context getContext() {
        return super.getContext();
    }

    public  <T> T getInstance(Object o, int i) {
        try {
            return ((Class<T>) ((ParameterizedType) (o.getClass()
                    .getGenericSuperclass())).getActualTypeArguments()[i])
                    .newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassCastException e) {
            e.printStackTrace();
        } catch (java.lang.InstantiationException e) {
            e.printStackTrace();
        }
        return null;
    }

    public abstract int setFragmentView();
    public abstract void initViews();
}
