import android.text.SpannableString;
import android.text.Spannable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wgp implements ccx
{
    public final Spannable a;
    public final int b;
    
    public wgp() {
        this(null, 0, 3, null);
    }
    
    public wgp(final Spannable a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    public wgp(final Spannable spannable, final int n, final int n2, final wg8 wg8) {
        final SpannableString a = new SpannableString((CharSequence)"");
        this.a = (Spannable)a;
        this.b = 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof wgp)) {
            return false;
        }
        final wgp wgp = (wgp)o;
        return e0e.a((Object)this.a, (Object)wgp.a) && this.b == wgp.b;
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode() * 31 + this.b;
    }
    
    @Override
    public final String toString() {
        final Spannable a = this.a;
        final int b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("SelectionTextViewState(spannable=");
        sb.append(a);
        sb.append(", selectionEnd=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
}
