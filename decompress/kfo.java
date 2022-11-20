import androidx.recyclerview.widget.m;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kfo extends l71<nfo>
{
    public final m.b g(final n3e<nfo> n3e, final n3e<nfo> n3e2) {
        return (m.b)new kfo.kfo$a((n3e)n3e, (n3e)n3e2);
    }
    
    public final long getItemId(final int n) {
        return Long.parseLong(((nfo)((ai8)this).getItem(n)).d);
    }
    
    public final boolean hasStableIds() {
        return true;
    }
}
