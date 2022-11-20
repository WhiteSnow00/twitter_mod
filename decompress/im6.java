import androidx.recyclerview.widget.m;

// 
// Decompiled by Procyon v0.6.0
// 

public final class im6 extends l71<vwp>
{
    public final m.b g(final n3e<vwp> n3e, final n3e<vwp> n3e2) {
        return (m.b)new im6.im6$a((n3e)n3e, (n3e)n3e2);
    }
    
    public final long getItemId(final int n) {
        return ((vwp)((ai8)this).getItem(n)).b().hashCode();
    }
    
    public final boolean hasStableIds() {
        return true;
    }
}
