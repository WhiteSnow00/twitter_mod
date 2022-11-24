import java.util.Iterator;
import java.util.ArrayList;
import android.content.Context;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class snz implements uoz
{
    public final List<uoz> a;
    
    public snz(final Context context, final rnz rnz) {
        final ArrayList a = new ArrayList();
        this.a = a;
        if (rnz.c()) {
            a.add(new lpz(context, rnz));
        }
    }
    
    public final void a(final dpz dpz) {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((uoz)iterator.next()).a(dpz);
        }
    }
}
