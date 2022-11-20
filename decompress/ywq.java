import android.widget.TextView;
import android.view.View;
import android.content.Context;
import android.widget.ImageView;
import kotlin.NoWhenBranchMatchedException;
import android.net.Uri;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ywq extends ste implements qsb<hwq, fzv>
{
    public final zxq D0;
    
    public ywq(final zxq d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(Object o) {
        final hwq hwq = (hwq)o;
        czd.f((Object)hwq, "$this$distinct");
        final zxq d0 = this.D0;
        final ijq o2 = hwq.o;
        Objects.requireNonNull(d0);
        final Object o3 = null;
        String a;
        if (o2 != null) {
            a = o2.a;
        }
        else {
            a = null;
        }
        if (a != null) {
            final String c = o2.c;
            if ((c == null || c.length() == 0) && !czd.a((Object)o2.b, (Object)"fire_tint_gradient")) {
                ((View)d0.s).setVisibility(8);
            }
            else {
                final ImageView s = d0.s;
                ((View)s).setVisibility(0);
                ((View)s).setClipToOutline(o2.d);
                final String c2 = o2.c;
                if (c2 != null && c2.length() != 0) {
                    s.setImageURI(Uri.parse(o2.c));
                }
                else if (czd.a((Object)o2.b, (Object)"fire_tint_gradient")) {
                    final Context context = ((View)s).getContext();
                    if (fgn.a[0] != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    s.setImageDrawable(context.getDrawable(2131231539));
                }
            }
            final StringBuilder sb = new StringBuilder();
            final String b = o2.b;
            if (b != null) {
                try {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("0x");
                    sb2.append(b);
                    final Integer decode = Integer.decode(sb2.toString());
                    czd.e((Object)decode, "decode(\"0x$icon\")");
                    final char[] chars = Character.toChars(decode.intValue());
                    czd.e((Object)chars, "toChars(Integer.decode(\"0x$icon\"))");
                    o = new String(chars);
                }
                catch (final Exception ex) {
                    o = o3;
                }
                if (o != null) {
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append((String)o);
                    sb3.append(" ");
                    sb.append(sb3.toString());
                }
            }
            sb.append(o2.a);
            ((TextView)d0.r).setText((CharSequence)sb.toString());
            ((View)d0.r).setVisibility(0);
        }
        else {
            ((View)d0.r).setVisibility(8);
            ((View)d0.s).setVisibility(8);
        }
        return fzv.a;
    }
}
