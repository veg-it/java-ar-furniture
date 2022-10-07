package com.notcreativestudio.arfurniture;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class SlideAdapter extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;

    public SlideAdapter(Context context){
        this.context = context;
    }

    //Arrays
    public String[] slide_headings = {
            "Вход для клиентов",
            "Вход для исполнителей"
    };

    public String[] slide_desc ={
            "Для того чтобы купить продукт или заказать чертеж, авторизируйтесь используя свой гугл аккаунт",
            "Для того чтобы разместить свою работу или получить заказ, авторизируйтесь используя свой гугл аккаунт"
    };

//    public String[] button_desc ={
//            "Войти как покупатель",
//            "Войти как работник"
//    };

    @Override
    public int getCount() {
        return slide_headings.length;
    }

    @Override
    public boolean isViewFromObject(View view,  Object o) {
        return view == (RelativeLayout) o;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.scroll_main_layout, container, false);

        TextView slideHeading = view.findViewById(R.id.loginHead);
        TextView slideDesc = view.findViewById(R.id.loginText);
//        Button slideButton = view.findViewById(R.id.slideLogin);

        slideHeading.setText(slide_headings[position]);
        slideDesc.setText(slide_desc[position]);
//        slideButton.setText(button_desc[position]);

        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((RelativeLayout)object);
    }


}
