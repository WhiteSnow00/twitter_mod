import android.content.res.TypedArray;
import androidx.fragment.app.v;
import androidx.fragment.app.r;
import android.view.View$OnAttachStateChangeListener;
import androidx.fragment.app.strictmode.Violation;
import androidx.fragment.app.strictmode.FragmentTagUsageViolation;
import android.view.ViewGroup;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.n;
import androidx.fragment.app.FragmentContainerView;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.p;
import android.view.LayoutInflater$Factory2;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jnb implements LayoutInflater$Factory2
{
    public final p D0;
    
    public jnb(final p d0) {
        this.D0 = d0;
    }
    
    public final View onCreateView(View k1, String g, Context context, final AttributeSet set) {
        if (FragmentContainerView.class.getName().equals(g)) {
            return (View)new FragmentContainerView(context, set, this.D0);
        }
        final boolean equals = "fragment".equals(g);
        g = null;
        if (!equals) {
            return null;
        }
        final String attributeValue = set.getAttributeValue((String)null, "class");
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, rp9.O0);
        int id = 0;
        String string;
        if ((string = attributeValue) == null) {
            string = obtainStyledAttributes.getString(0);
        }
        final int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        final String string2 = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (string != null) {
            final ClassLoader classLoader = context.getClassLoader();
            final d8q a = n.a;
            boolean assignable;
            try {
                assignable = Fragment.class.isAssignableFrom(n.b(classLoader, string));
            }
            catch (final ClassNotFoundException ex) {
                assignable = false;
            }
            if (assignable) {
                if (k1 != null) {
                    id = k1.getId();
                }
                if (id == -1 && resourceId == -1 && string2 == null) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append(set.getPositionDescription());
                    sb.append(": Must specify unique android:id, android:tag, or have a parent with an id for ");
                    sb.append(string);
                    throw new IllegalArgumentException(sb.toString());
                }
                if (resourceId != -1) {
                    g = (String)this.D0.G(resourceId);
                }
                Object h;
                if ((h = g) == null) {
                    h = g;
                    if (string2 != null) {
                        h = this.D0.H(string2);
                    }
                }
                Fragment g2;
                if ((g2 = (Fragment)h) == null) {
                    g2 = (Fragment)h;
                    if (id != -1) {
                        g2 = this.D0.G(id);
                    }
                }
                Fragment fragment;
                r r;
                if (g2 == null) {
                    final Fragment a2 = this.D0.L().a(context.getClassLoader(), string);
                    a2.Q0 = true;
                    int z0;
                    if (resourceId != 0) {
                        z0 = resourceId;
                    }
                    else {
                        z0 = id;
                    }
                    a2.Z0 = z0;
                    a2.a1 = id;
                    a2.b1 = string2;
                    a2.R0 = true;
                    final p d0 = this.D0;
                    a2.V0 = d0;
                    final hnb u = d0.u;
                    a2.W0 = (hnb<?>)u;
                    context = u.F0;
                    a2.u1();
                    final r a3 = this.D0.a(a2);
                    fragment = a2;
                    r = a3;
                    if (p.P(2)) {
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("Fragment ");
                        sb2.append(a2);
                        sb2.append(" has been inflated via the <fragment> tag: id=0x");
                        sb2.append(Integer.toHexString(resourceId));
                        Log.v("FragmentManager", sb2.toString());
                        fragment = a2;
                        r = a3;
                    }
                }
                else {
                    if (g2.R0) {
                        final StringBuilder sb3 = new StringBuilder();
                        sb3.append(set.getPositionDescription());
                        sb3.append(": Duplicate id 0x");
                        sb3.append(Integer.toHexString(resourceId));
                        sb3.append(", tag ");
                        sb3.append(string2);
                        sb3.append(", or parent id 0x");
                        sb3.append(Integer.toHexString(id));
                        sb3.append(" with another fragment for ");
                        sb3.append(string);
                        throw new IllegalArgumentException(sb3.toString());
                    }
                    g2.R0 = true;
                    final p d2 = this.D0;
                    g2.V0 = d2;
                    final hnb u2 = d2.u;
                    g2.W0 = (hnb<?>)u2;
                    context = u2.F0;
                    g2.u1();
                    final r f = this.D0.f(g2);
                    fragment = g2;
                    r = f;
                    if (p.P(2)) {
                        final StringBuilder sb4 = new StringBuilder();
                        sb4.append("Retained Fragment ");
                        sb4.append(g2);
                        sb4.append(" has been re-attached via the <fragment> tag: id=0x");
                        sb4.append(Integer.toHexString(resourceId));
                        Log.v("FragmentManager", sb4.toString());
                        r = f;
                        fragment = g2;
                    }
                }
                final ViewGroup j1 = (ViewGroup)k1;
                final oob a4 = oob.a;
                final FragmentTagUsageViolation fragmentTagUsageViolation = new FragmentTagUsageViolation(fragment, j1);
                final oob a5 = oob.a;
                oob.c((Violation)fragmentTagUsageViolation);
                final oob$c a6 = oob.a(fragment);
                if (a6.a.contains(oob$a.G0) && oob.f(a6, (Class)fragment.getClass(), (Class)FragmentTagUsageViolation.class)) {
                    oob.b(a6, (Violation)fragmentTagUsageViolation);
                }
                fragment.j1 = j1;
                r.k();
                r.j();
                k1 = fragment.k1;
                if (k1 != null) {
                    if (resourceId != 0) {
                        k1.setId(resourceId);
                    }
                    if (fragment.k1.getTag() == null) {
                        fragment.k1.setTag((Object)string2);
                    }
                    fragment.k1.addOnAttachStateChangeListener((View$OnAttachStateChangeListener)new View$OnAttachStateChangeListener(this, r) {
                        public final r D0;
                        public final jnb E0;
                        
                        public final void onViewAttachedToWindow(final View view) {
                            final r d0 = this.D0;
                            final Fragment c = d0.c;
                            d0.k();
                            v.g((ViewGroup)c.k1.getParent(), this.E0.D0).e();
                        }
                        
                        public final void onViewDetachedFromWindow(final View view) {
                        }
                    });
                    return fragment.k1;
                }
                throw new IllegalStateException(da8.j("Fragment ", string, " did not create a view."));
            }
        }
        return null;
    }
    
    public final View onCreateView(final String s, final Context context, final AttributeSet set) {
        return this.onCreateView(null, s, context, set);
    }
}
