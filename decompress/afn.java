import android.widget.TextView;
import android.content.res.Resources;
import java.util.Iterator;
import java.util.List;
import com.twitter.ui.components.text.legacy.TypefacesTextView;
import java.util.Arrays;
import com.twitter.rooms.model.helpers.RoomUserItem;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afn extends ste implements qsb<zfn, fzv>
{
    public final ven D0;
    
    public afn(final ven d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final zfn zfn = (zfn)o;
        czd.f((Object)zfn, "$this$distinct");
        if (ven.b(this.D0, zfn)) {
            final ven d0 = this.D0;
            d0.O0.setVisibility(0);
            if (zfn.o > 0) {
                ((TextView)d0.M0).setTextColor(d0.V0);
                final TypefacesTextView m0 = d0.M0;
                CharSequence text;
                if (zfn.o == 1) {
                    text = d0.E0.getResources().getText(2131953579);
                }
                else {
                    text = d0.E0.getResources().getString(2131953574, new Object[] { zfn.o });
                }
                ((TextView)m0).setText(text);
            }
            else if (zfn.p.isEmpty() ^ true) {
                ((TextView)d0.M0).setTextColor(d0.W0);
                final List h0 = mq4.H0((Iterable)zfn.p, 3);
                final ArrayList list = new ArrayList<Object>(iq4.H((Iterable)h0, 10));
                final Iterator iterator = h0.iterator();
                while (iterator.hasNext()) {
                    list.add(mq4.g0(zkr.y0((CharSequence)((RoomUserItem)iterator.next()).getName(), new String[] { " " })));
                }
                final String[] array = list.toArray(new String[0]);
                czd.d((Object)array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                final String[] array2 = array;
                final int length = array2.length;
                int n;
                if (length != 1) {
                    if (length != 2) {
                        n = 2131953576;
                    }
                    else {
                        n = 2131953577;
                    }
                }
                else {
                    n = 2131953578;
                }
                ((TextView)d0.M0).setText((CharSequence)d0.E0.getResources().getString(n, (Object[])Arrays.copyOf(array2, array2.length)));
            }
        }
        else {
            final ven d2 = this.D0;
            ((TextView)d2.M0).setTextColor(d2.W0);
            d2.O0.setVisibility(4);
            final String l = zfn.l;
            String s;
            if (l == null || vkr.V((CharSequence)l)) {
                if (zfn.k == wqn.E0) {
                    s = d2.E0.getResources().getString(2131953573);
                }
                else {
                    final Resources resources = d2.E0.getResources();
                    String d3;
                    if ((d3 = zfn.d) == null) {
                        d3 = "";
                    }
                    s = resources.getString(2131953572, new Object[] { d3 });
                }
            }
            else {
                s = zfn.l;
            }
            czd.e((Object)s, "if (description.isNullOr\u2026    description\n        }");
            final TypefacesTextView m2 = d2.M0;
            final int i = zfn.i;
            String string = s;
            if (i != 0) {
                if (i != 1) {
                    string = d2.E0.getResources().getString(2131953575, new Object[] { String.valueOf(zfn.i), s });
                }
                else {
                    final String j = zfn.l;
                    String s2;
                    if (j == null || vkr.V((CharSequence)j)) {
                        s2 = d2.E0.getResources().getString(2131953580, new Object[] { s });
                    }
                    else {
                        s2 = d2.E0.getResources().getString(2131953580, new Object[] { s });
                    }
                    string = s2;
                }
            }
            ((TextView)m2).setText((CharSequence)string);
        }
        return fzv.a;
    }
}
