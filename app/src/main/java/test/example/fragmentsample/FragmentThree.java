package test.example.fragmentsample;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import test.example.fragmentsample.databinding.FragmentThreeBinding;

/**
 * Created by Oleh Makhobey on 15.05.2016.
 * tajcig@ya.ru
 */
public class FragmentThree  extends Fragment{
    private FragmentThreeBinding b;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        b = DataBindingUtil.inflate(inflater, R.layout.fragment_three,container,false);
        return b.getRoot();
    }
}
