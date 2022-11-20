import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;
import java.util.Set;
import java.util.Iterator;
import java.util.List;
import java.util.Collection;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class spn extends ste implements qsb<wpn, fzv>
{
    public final ipn D0;
    
    public spn(final ipn d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final wpn wpn = (wpn)o;
        czd.f((Object)wpn, "$this$distinct");
        if (ikr.g((CharSequence)((AppCompatEditText)this.D0.M0).getText())) {
            final String string = this.D0.Q0.getString(2131954480, new Object[] { ((AppCompatEditText)this.D0.M0).getText() });
            czd.e((Object)string, "resources.getString(R.st\u2026s_returned, searchString)");
            ((View)this.D0.J0).announceForAccessibility((CharSequence)string);
        }
        if (wpn.f.isEmpty()) {
            ((View)this.D0.K0).setAlpha(0.25f);
            ((View)this.D0.K0).setEnabled(false);
        }
        else {
            ((View)this.D0.K0).setAlpha(1.0f);
            ((View)this.D0.K0).setEnabled(true);
        }
        if (!wpn.h) {
            ipn.a(this.D0, wpn.c);
        }
        else {
            final List g = wpn.g;
            final ArrayList list = new ArrayList<String>(iq4.H((Iterable)g, 10));
            final Iterator iterator = g.iterator();
            while (iterator.hasNext()) {
                list.add(((zon)iterator.next()).a.a);
            }
            final Set f = wpn.f;
            final ArrayList list2 = new ArrayList<String>(iq4.H((Iterable)f, 10));
            final Iterator iterator2 = f.iterator();
            while (iterator2.hasNext()) {
                list2.add(((uon)iterator2.next()).a);
            }
            if (!ikr.g((CharSequence)((AppCompatEditText)this.D0.M0).getText()) && wpn.b == gpn.G0) {
                final List c = wpn.c;
                final ArrayList<zon> list3 = new ArrayList<zon>();
                for (final Object next : c) {
                    if (!list.contains(((zon)next).a.a)) {
                        list3.add((zon)next);
                    }
                }
                ipn.a(this.D0, ipn.b(this.D0, list, wpn.i, mq4.x0((Collection)wpn.g, (Iterable)list3), list2));
            }
            else {
                final ipn d0 = this.D0;
                ipn.a(d0, ipn.b(d0, list, wpn.i, wpn.c, list2));
            }
        }
        return fzv.a;
    }
}
