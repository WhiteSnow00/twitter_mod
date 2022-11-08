import androidx.recyclerview.widget.m$b;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jkt extends s71<atu>
{
    public final m$b g(i4e<atu> j, final i4e<atu> i4e) {
        i4e<atu> i = j;
        if (j == null) {
            i = i4e.j();
        }
        if ((j = i4e) == null) {
            j = i4e.j();
        }
        return (m$b)new jkt.jkt$a((i4e)i, (i4e)j);
    }
    
    public final long getItemId(final int n) {
        final Object item = ((ri8)this).getItem(n);
        zzd.e(item, "getItem(position)");
        return w4j.d(((atu)item).k.D());
    }
    
    public final boolean hasStableIds() {
        return true;
    }
}
