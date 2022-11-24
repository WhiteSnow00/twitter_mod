// 
// Decompiled by Procyon v0.6.0
// 

package androidx.preference;

import android.os.BaseBundle;
import android.os.Handler;
import android.graphics.drawable.Drawable;
import android.content.res.TypedArray;
import java.util.Objects;
import androidx.recyclerview.widget.RecyclerView$l;
import androidx.recyclerview.widget.e0;
import androidx.recyclerview.widget.RecyclerView$m;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.util.TypedValue;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$e;
import android.view.View;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.fragment.app.Fragment;

public abstract class d extends Fragment implements f$c, f$a, f$b, DialogPreference$a
{
    public f C1;
    public RecyclerView D1;
    public boolean E1;
    public boolean F1;
    public ContextThemeWrapper G1;
    public int H1;
    public final d.d$c I1;
    public d$a J1;
    public final d$b K1;
    
    public d() {
        this.H1 = 2131625189;
        this.I1 = new d.d$c(this);
        this.J1 = new d$a(this);
        this.K1 = new d$b(this);
    }
    
    public void A1(final Bundle bundle) {
        final PreferenceScreen g = this.C1.g;
        if (g != null) {
            final Bundle bundle2 = new Bundle();
            ((PreferenceGroup)g).i(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }
    
    public void B1() {
        super.k1 = true;
        final f c1 = this.C1;
        c1.h = (f$c)this;
        c1.i = (f$a)this;
    }
    
    public void C1() {
        super.k1 = true;
        final f c1 = this.C1;
        c1.h = null;
        c1.i = null;
    }
    
    public void D1(final View view, final Bundle bundle) {
        if (bundle != null) {
            final Bundle bundle2 = bundle.getBundle("android:preferences");
            if (bundle2 != null) {
                final PreferenceScreen g = this.C1.g;
                if (g != null) {
                    ((PreferenceGroup)g).g(bundle2);
                }
            }
        }
        if (this.E1) {
            final PreferenceScreen g2 = this.C1.g;
            if (g2 != null) {
                this.D1.setAdapter((RecyclerView$e)new e((PreferenceGroup)g2));
                ((PreferenceGroup)g2).A();
            }
        }
        this.F1 = true;
    }
    
    public final void Y1(final int n) {
        final f c1 = this.C1;
        if (c1 != null) {
            this.a2(c1.d((Context)this.G1, n, c1.g));
            return;
        }
        throw new RuntimeException("This should be called after super.onCreate.");
    }
    
    public abstract void Z1(final Bundle p0, final String p1);
    
    public final void a2(final PreferenceScreen g) {
        final f c1 = this.C1;
        final PreferenceScreen g2 = c1.g;
        boolean b;
        if (g != g2) {
            if (g2 != null) {
                ((PreferenceGroup)g2).E();
            }
            c1.g = g;
            b = true;
        }
        else {
            b = false;
        }
        if (b && g != null) {
            this.E1 = true;
            if (this.F1) {
                if (!((Handler)this.J1).hasMessages(1)) {
                    ((Handler)this.J1).obtainMessage(1).sendToTarget();
                }
            }
        }
    }
    
    public final void b2(final int n, final String s) {
        final f c1 = this.C1;
        if (c1 != null) {
            Object o;
            final PreferenceScreen preferenceScreen = (PreferenceScreen)(o = c1.d((Context)this.G1, n, (PreferenceScreen)null));
            if (s != null) {
                o = ((PreferenceGroup)preferenceScreen).Z((CharSequence)s);
                if (!(o instanceof PreferenceScreen)) {
                    throw new IllegalArgumentException(c0e.h("Preference object with key ", s, " is not a PreferenceScreen"));
                }
            }
            this.a2((PreferenceScreen)o);
            return;
        }
        throw new RuntimeException("This should be called after super.onCreate.");
    }
    
    public final Preference c0(final CharSequence charSequence) {
        final f c1 = this.C1;
        final Preference preference = null;
        if (c1 == null) {
            return null;
        }
        final PreferenceScreen g = c1.g;
        Preference z;
        if (g == null) {
            z = preference;
        }
        else {
            z = ((PreferenceGroup)g).Z(charSequence);
        }
        return z;
    }
    
    public void k1(final Bundle bundle) {
        super.k1(bundle);
        final TypedValue typedValue = new TypedValue();
        ((Context)this.L0()).getTheme().resolveAttribute(2130970351, typedValue, true);
        int resourceId;
        if ((resourceId = typedValue.resourceId) == 0) {
            resourceId = 2132018147;
        }
        final ContextThemeWrapper g1 = new ContextThemeWrapper((Context)this.L0(), resourceId);
        this.G1 = g1;
        final f c1 = new f((Context)g1);
        this.C1 = c1;
        c1.j = (f$b)this;
        final Bundle l0 = super.L0;
        String string;
        if (l0 != null) {
            string = ((BaseBundle)l0).getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT");
        }
        else {
            string = null;
        }
        this.Z1(bundle, string);
    }
    
    public View m1(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final TypedArray obtainStyledAttributes = ((Context)this.G1).obtainStyledAttributes((AttributeSet)null, bs4.b1, 2130970340, 0);
        this.H1 = obtainStyledAttributes.getResourceId(0, this.H1);
        final Drawable drawable = obtainStyledAttributes.getDrawable(1);
        final int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, -1);
        final boolean boolean1 = obtainStyledAttributes.getBoolean(3, true);
        obtainStyledAttributes.recycle();
        final LayoutInflater cloneInContext = layoutInflater.cloneInContext((Context)this.G1);
        final View inflate = cloneInContext.inflate(this.H1, viewGroup, false);
        final View viewById = inflate.findViewById(16908351);
        if (viewById instanceof ViewGroup) {
            final ViewGroup viewGroup2 = (ViewGroup)viewById;
            RecyclerView d1 = null;
            Label_0182: {
                if (((Context)this.G1).getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                    d1 = (RecyclerView)((View)viewGroup2).findViewById(2131430937);
                    if (d1 != null) {
                        break Label_0182;
                    }
                }
                d1 = (RecyclerView)cloneInContext.inflate(2131625191, viewGroup2, false);
                this.L0();
                d1.setLayoutManager((RecyclerView$m)new LinearLayoutManager(1));
                d1.setAccessibilityDelegateCompat((e0)new gwk(d1));
            }
            (this.D1 = d1).h((RecyclerView$l)this.I1);
            final d.d$c i1 = this.I1;
            Objects.requireNonNull(i1);
            if (drawable != null) {
                i1.b = drawable.getIntrinsicHeight();
            }
            else {
                i1.b = 0;
            }
            i1.a = drawable;
            i1.d.D1.W();
            if (dimensionPixelSize != -1) {
                final d.d$c i2 = this.I1;
                i2.b = dimensionPixelSize;
                i2.d.D1.W();
            }
            this.I1.c = boolean1;
            if (((View)this.D1).getParent() == null) {
                viewGroup2.addView((View)this.D1);
            }
            ((Handler)this.J1).post((Runnable)this.K1);
            return inflate;
        }
        throw new RuntimeException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
    }
    
    public void q1() {
        ((Handler)this.J1).removeCallbacks((Runnable)this.K1);
        ((Handler)this.J1).removeMessages(1);
        if (this.E1) {
            final PreferenceScreen g = this.C1.g;
            if (g != null) {
                ((PreferenceGroup)g).E();
            }
        }
        this.D1 = null;
        super.k1 = true;
    }
}
