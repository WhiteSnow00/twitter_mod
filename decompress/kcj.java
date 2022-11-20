import com.twitter.ui.components.button.legacy.TwitterButton;
import androidx.constraintlayout.widget.b;
import android.widget.TextView;
import android.view.ViewGroup$LayoutParams;
import android.view.View$OnClickListener;
import com.twitter.ui.components.button.legacy.HashflagTwitterButton;
import kotlin.NoWhenBranchMatchedException;
import java.util.Objects;
import com.twitter.onboarding.ocf.NavigationHandler;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kcj
{
    public static final b Companion;
    public static final qwe<Map<Integer, d>> c;
    public final ConstraintLayout a;
    public final View b;
    
    static {
        Companion = new b();
        kcj.c = (n4s)pps.n((nsb)kcj$a.D0);
    }
    
    public kcj(final LayoutInflater layoutInflater) {
        czd.f((Object)layoutInflater, "inflater");
        final View inflate = layoutInflater.inflate(2131625042, (ViewGroup)null);
        czd.d((Object)inflate, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        final ConstraintLayout a = (ConstraintLayout)inflate;
        this.a = a;
        final View viewById = ((View)a).findViewById(2131430435);
        czd.e((Object)viewById, "rootView.findViewById(R.id.ocf_separator)");
        this.b = viewById;
    }
    
    public final void a(final jcj jcj, final NavigationHandler navigationHandler, final dej dej, final boolean b) {
        czd.f((Object)jcj, "ocfButton");
        czd.f((Object)navigationHandler, "navigationHandler");
        czd.f((Object)dej, "richTextProcessor");
        final b companion = kcj.Companion;
        final int d = jcj.d;
        final a53 e = jcj.e;
        Objects.requireNonNull(companion);
        czd.f((Object)e, "buttonSize");
        final d d2 = ((Map)kcj.c.getValue()).get(d);
        final int n = 1;
        final fzv fzv = null;
        Integer value;
        if (d2 != null) {
            final int ordinal = ((Enum)e).ordinal();
            int n2;
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal != 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                            n2 = d2.e;
                        }
                        else {
                            n2 = d2.d;
                        }
                    }
                    else {
                        n2 = d2.c;
                    }
                }
                else {
                    n2 = d2.b;
                }
            }
            else {
                n2 = d2.a;
            }
            value = n2;
        }
        else {
            value = null;
        }
        int intValue;
        if (value == null) {
            m8a.d((Throwable)new RuntimeException("Invalid button style"));
            intValue = 2132018056;
        }
        else {
            intValue = value;
        }
        final HashflagTwitterButton hashflagTwitterButton = new HashflagTwitterButton(((View)this.a).getContext(), intValue);
        ((TextView)hashflagTwitterButton).setText((CharSequence)jcj.c);
        ((View)hashflagTwitterButton).setOnClickListener((View$OnClickListener)new e1p((Object)navigationHandler, (Object)jcj, 11));
        final ConstraintLayout.a layoutParams = new ConstraintLayout.a(-1, -2);
        float n3;
        if (b && jcj.b == null) {
            n3 = ((View)this.a).getResources().getDimension(2131166795);
        }
        else {
            n3 = ((View)this.a).getResources().getDimension(2131166728);
        }
        layoutParams.topMargin = (int)n3;
        ((View)hashflagTwitterButton).setLayoutParams((ViewGroup$LayoutParams)layoutParams);
        ((View)hashflagTwitterButton).setId(2131430434);
        mdj f = jcj.f;
        int n4;
        if (f != mdj.F0) {
            n4 = n;
        }
        else {
            n4 = 0;
        }
        if (n4 == 0) {
            f = null;
        }
        if (f != null) {
            ((TwitterButton)hashflagTwitterButton).setIcon(f.D0);
        }
        final vjp b2 = jcj.b;
        fzv a = fzv;
        if (b2 != null) {
            this.b.setVisibility(0);
            final View viewById = this.b.findViewById(2131430438);
            czd.e((Object)viewById, "separator.findViewById(R.id.ocf_separator_text)");
            dej.b((TextView)viewById, (oxm)b2.a);
            a = fzv.a;
        }
        if (a == null) {
            this.b.setVisibility(8);
        }
        final HashflagTwitterButton hashflagTwitterButton2 = (HashflagTwitterButton)((View)this.a).findViewById(2131430434);
        if (hashflagTwitterButton2 != null) {
            this.a.removeView((View)hashflagTwitterButton2);
        }
        this.a.addView((View)hashflagTwitterButton);
        final androidx.constraintlayout.widget.b b3 = new androidx.constraintlayout.widget.b();
        b3.g(this.a);
        b3.i(((View)hashflagTwitterButton).getId(), 3, this.b.getId(), 4);
        b3.i(((View)hashflagTwitterButton).getId(), 7, 0, 7);
        b3.i(((View)hashflagTwitterButton).getId(), 4, 0, 4);
        b3.i(((View)hashflagTwitterButton).getId(), 6, 0, 6);
        b3.b(this.a);
    }
    
    public static final class b
    {
    }
    
    public static final class c
    {
        public final LayoutInflater a;
        
        public c(final LayoutInflater a) {
            czd.f((Object)a, "layoutInflater");
            this.a = a;
        }
        
        public final kcj a() {
            return new kcj(this.a);
        }
    }
    
    public static final class d
    {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        
        public d(final int a, final int b, final int c, final int d, final int e) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof d)) {
                return false;
            }
            final d d = (d)o;
            return this.a == d.a && this.b == d.b && this.c == d.c && this.d == d.d && this.e == d.e;
        }
        
        @Override
        public final int hashCode() {
            return (((this.a * 31 + this.b) * 31 + this.c) * 31 + this.d) * 31 + this.e;
        }
        
        @Override
        public final String toString() {
            final int a = this.a;
            final int b = this.b;
            final int c = this.c;
            final int d = this.d;
            final int e = this.e;
            final StringBuilder f = shc.f("OcfButtonStyle(large=", a, ", largeCompact=", b, ", normal=");
            k0c.k(f, c, ", normalCompact=", d, ", small=");
            return wc0.A(f, e, ")");
        }
    }
}
