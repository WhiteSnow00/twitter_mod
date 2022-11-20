import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.p;
import android.content.Context;
import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hqo
{
    public static jjl a(final Resources resources, final String s, final int n) {
        final kjl$b kjl$b = new kjl$b(n);
        ((kjl$a)kjl$b).I(resources.getString(2131959459, new Object[] { s }));
        ((kjl$a)kjl$b).B((CharSequence)resources.getString(2131959463, new Object[] { s }));
        ((kjl$a)kjl$b).F(2131952202);
        ((kjl$a)kjl$b).C(2131952374);
        return (jjl)((xk1$a)kjl$b).w();
    }
    
    public static jjl b(final Context context, final String s, final int n) {
        final kjl$b kjl$b = new kjl$b(n);
        ((kjl$a)kjl$b).I(context.getString(2131959488, new Object[] { s }));
        ((kjl$a)kjl$b).B((CharSequence)context.getString(2131959490));
        ((kjl$a)kjl$b).F(2131959489);
        ((kjl$a)kjl$b).C(2131952374);
        return (jjl)((xk1$a)kjl$b).w();
    }
    
    public static jjl c(final Context context, final String s, final int n) {
        final kjl$b kjl$b = new kjl$b(n);
        ((kjl$a)kjl$b).I(context.getResources().getString(2131959505, new Object[] { s }));
        ((kjl$a)kjl$b).B((CharSequence)context.getResources().getString(2131959503));
        ((kjl$a)kjl$b).F(2131959501);
        ((kjl$a)kjl$b).C(2131952374);
        return (jjl)((xk1$a)kjl$b).w();
    }
    
    public static boolean d(final Integer n) {
        int intValue;
        if (n == null) {
            intValue = 0;
        }
        else {
            intValue = n;
        }
        return chw.h0(intValue);
    }
    
    public static void e(final Context context, final String s, final int n, final p p5, final xv8 xv8) {
        f(context, s, n, p5, xv8, null);
    }
    
    public static void f(final Context context, final String s, int a, final p p6, final xv8 u1, final Fragment fragment) {
        final jjl a2 = a(context.getResources(), s, a);
        if (u1 != null) {
            ((wk1)a2).U1 = u1;
            a = c5j.a;
        }
        if (fragment != null) {
            ((wk1)a2).k2(fragment);
        }
        ((wk1)a2).l2(p6);
    }
    
    public static boolean g(final Context context, final String s, int a, final int n, final p p6, final xv8 u1) {
        final SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        final int int1 = defaultSharedPreferences.getInt("mute_confirm_cnt", 0);
        if (int1 < 3) {
            defaultSharedPreferences.edit().putInt("mute_confirm_cnt", int1 + 1).apply();
            String s2;
            if (chw.d0(a)) {
                s2 = context.getString(2131955223, new Object[] { s });
            }
            else {
                s2 = context.getString(2131955222, new Object[] { s });
            }
            final kjl$b kjl$b = new kjl$b(n);
            ((kjl$a)kjl$b).I(context.getString(2131955225, new Object[] { s }));
            ((kjl$a)kjl$b).B((CharSequence)s2);
            ((kjl$a)kjl$b).F(2131955224);
            ((kjl$a)kjl$b).C(2131952374);
            final jjl jjl = (jjl)((xk1$a)kjl$b).w();
            if (u1 != null) {
                ((wk1)jjl).U1 = u1;
                a = c5j.a;
            }
            ((wk1)jjl).l2(p6);
            return true;
        }
        return false;
    }
    
    public static void h(final Context context, final String s, int a, final p p5, final xv8 u1) {
        final jjl c = c(context, s, a);
        if (u1 != null) {
            ((wk1)c).U1 = u1;
            a = c5j.a;
        }
        ((wk1)c).l2(p5);
    }
    
    public static void i(final Context context, final String s, int a, final p p5, final xv8 u1) {
        final String string = context.getString(2131959348, new Object[] { s });
        final kjl$b kjl$b = new kjl$b(a);
        ((kjl$a)kjl$b).I(string);
        ((kjl$a)kjl$b).A(2131959343);
        ((kjl$a)kjl$b).F(2131959344);
        ((kjl$a)kjl$b).C(2131952374);
        final jjl jjl = (jjl)((xk1$a)kjl$b).w();
        if (u1 != null) {
            ((wk1)jjl).U1 = u1;
            a = c5j.a;
        }
        ((wk1)jjl).l2(p5);
    }
}
