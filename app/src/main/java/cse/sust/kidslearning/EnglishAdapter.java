package cse.sust.kidslearning;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import java.util.Locale;
import cse.sust.kidslearning.A_activity;
import cse.sust.kidslearning.b_Activity;
import  cse.sust.kidslearning.c_activity;
import  cse.sust.kidslearning.d_activity;
import  cse.sust.kidslearning.e_activity;
import  cse.sust.kidslearning.f_activity;
import  cse.sust.kidslearning.g_activity;
import  cse.sust.kidslearning.h_activity;
import  cse.sust.kidslearning.i_activity;
import  cse.sust.kidslearning.j_activity;
import  cse.sust.kidslearning.k_activity;
import  cse.sust.kidslearning.l_activity;
import  cse.sust.kidslearning.m_actvity;
import  cse.sust.kidslearning.n_activity;
import  cse.sust.kidslearning.o_activity;
import  cse.sust.kidslearning.p_activity;
import  cse.sust.kidslearning.q_activity;
import  cse.sust.kidslearning.r_activity;
import  cse.sust.kidslearning.s_activity;
import  cse.sust.kidslearning.t_activity;
import  cse.sust.kidslearning.u_activity;
import  cse.sust.kidslearning.v_activity;
import  cse.sust.kidslearning.w_activity;
import  cse.sust.kidslearning.x_activity;
import  cse.sust.kidslearning.y_activity;
import  cse.sust.kidslearning.z_activity;

public class EnglishAdapter extends FragmentPagerAdapter {
    public EnglishAdapter(FragmentManager fm) {
        super(fm);
    }


    @Override
    public Fragment getItem(int i) {

        switch (i) {
            case 0:
                A_activity t1 = new A_activity();
                return t1;
            case 1:
                b_Activity t2 = new b_Activity();
                return t2;
            case 2:
                c_activity t3 = new c_activity();
                return t3;
            case 3:
                d_activity t4 = new d_activity();
                return t4;
            case 4:
                e_activity t5 = new e_activity();
                return t5;
            case 5:
                f_activity t6 = new f_activity();
                return t6;
            case 6:
                g_activity t7 = new g_activity();
                return t7;
            case 7:
                h_activity t8 = new h_activity();
                return t8;
            case 8:
                i_activity t9 = new i_activity();
                return t9;
            case 9:
                j_activity t10 = new j_activity();
                return t10;
            case 10:
                k_activity t11 = new k_activity();
                return t11;
            case 11:
                l_activity t12 = new l_activity();
                return t12;
            case 12:
                m_actvity t13 = new m_actvity();
                return t13;
            case 13:
                n_activity t14 = new n_activity();
                return t14;
            case 14:
                o_activity t15 = new o_activity();
                return t15;
            case 15:
                p_activity t16 = new p_activity();
                return t16;
            case 16:
                q_activity t17 = new q_activity();
                return t17;
            case 17:
                r_activity t18 = new r_activity();
                return t18;
            case 18:
                s_activity t19 = new s_activity();
                return t19;
            case 19:
                t_activity t20 = new t_activity();
                return t20;
            case 20:
                u_activity t21 = new u_activity();
                return t21;
            case 21:
                v_activity t22 = new v_activity();
                return t22;
            case 22:
                w_activity t23 = new w_activity();
                return t23;
            case 23:
                x_activity t24 = new x_activity();
                return t24;
            case 24:
                y_activity t25 = new y_activity();
                return t25;
            case 25:
                z_activity t26 = new z_activity();
                return t26;
        }
        return null;
    }

    @Override
    public int getCount() {
        return 26;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        Locale l = Locale.getDefault();
        switch (position) {
            case 0:
                return "Aa";
            case 1:
                return "Bb";
            case 2:
                return "Cc";
            case 3:
                return "Dd";
            case 4:
                return "Ee";
            case 5:
                return "Ff";
            case 6:
                return "Gg";
            case 7:
                return "Hh";
            case 8:
                return "Ii";
            case 9:
                return "Jj";
            case 10:
                return "Kk";
            case 11:
                return "Ll";
            case 12:
                return "Mm";
            case 13:
                return "Nn";
            case 14:
                return "Oo";
            case 15:
                return "Pp";
            case 16:
                return "Qq";
            case 17:
                return "Rr";
            case 18:
                return "Ss";
            case 19:
                return "Tt";
            case 20:
                return "Uu";
            case 21:
                return "Vv";
            case 22:
                return "Ww";
            case 23:
                return "Xx";
            case 24:
                return "Yy";
            case 25:
                return "Zz";
        }
        return null;
    }
}
