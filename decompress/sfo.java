import android.widget.TextView;
import com.twitter.ui.components.text.legacy.TypefacesTextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class sfo extends ste implements qsb<xfo, fzv>
{
    public final pfo D0;
    
    public sfo(final pfo d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(Object o) {
        final xfo xfo = (xfo)o;
        czd.f((Object)xfo, "$this$distinct");
        final TypefacesTextView f0 = this.D0.F0;
        final StringBuilder sb = new StringBuilder();
        final String b = xfo.b;
        czd.f((Object)b, "icon");
        try {
            o = new StringBuilder();
            ((StringBuilder)o).append("0x");
            ((StringBuilder)o).append(b);
            final Integer decode = Integer.decode(((StringBuilder)o).toString());
            czd.e((Object)decode, "decode(\"0x$icon\")");
            final char[] chars = Character.toChars(decode.intValue());
            czd.e((Object)chars, "toChars(Integer.decode(\"0x$icon\"))");
            o = new String(chars);
        }
        catch (final Exception ex) {
            o = null;
        }
        if (o != null) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append((String)o);
            sb2.append(" ");
            sb.append(sb2.toString());
        }
        sb.append(xfo.a);
        ((TextView)f0).setText((CharSequence)sb.toString());
        return fzv.a;
    }
}
