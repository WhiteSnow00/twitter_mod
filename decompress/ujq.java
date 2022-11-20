import android.widget.LinearLayout;
import com.twitter.ui.components.text.legacy.TypefacesTextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ujq
{
    public final TypefacesTextView a;
    public final LinearLayout b;
    
    public ujq(final TypefacesTextView a) {
        this.a = a;
        this.b = null;
    }
    
    public ujq(final TypefacesTextView a, final LinearLayout b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ujq)) {
            return false;
        }
        final ujq ujq = (ujq)o;
        return czd.a((Object)this.a, (Object)ujq.a) && czd.a((Object)this.b, (Object)ujq.b);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final LinearLayout b = this.b;
        int hashCode2;
        if (b == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = b.hashCode();
        }
        return hashCode * 31 + hashCode2;
    }
    
    @Override
    public final String toString() {
        final TypefacesTextView a = this.a;
        final LinearLayout b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("SocialProofViews(textView=");
        sb.append(a);
        sb.append(", facePile=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
}
