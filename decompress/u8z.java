import java.util.Iterator;
import android.content.Intent;
import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import java.util.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class u8z implements Runnable
{
    public final int D0;
    public final Object E0;
    public final Object F0;
    public final Object G0;
    
    public u8z(final ara f0, final List g0, final List e0) {
        this.D0 = 2;
        this.F0 = f0;
        this.G0 = g0;
        this.E0 = e0;
    }
    
    public u8z(final lbz e0, final rd f0, final Object g0, final int d0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
    }
    
    @Override
    public final void run() {
        switch (this.D0) {
            default: {
                final ara ara = (ara)this.F0;
                final List list = (List)this.G0;
                final List list2 = (List)this.E0;
                Objects.requireNonNull(ara);
                final ArrayList list3 = new ArrayList();
                final ArrayList list4 = new ArrayList();
                for (final File file : list) {
                    final String q = oj7.q(file);
                    final Uri fromFile = Uri.fromFile(file);
                    final Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setDataAndType(fromFile, ara.b.getContentResolver().getType(fromFile));
                    intent.addFlags(1);
                    intent.putExtra("module_name", ara.j(q));
                    intent.putExtra("split_id", q);
                    list3.add(intent);
                    list4.add(ara.j(oj7.q(file)));
                }
                final o2r g = ara.g();
                if (g != null) {
                    ara.h.execute((Runnable)new sdz(ara, g.i(), (List)list3, (List)list4, list2));
                }
                return;
            }
            case 1: {
                ((lbz)this.E0).a.f();
                ((lbz)this.E0).a.j((wgy)this.F0, (String)this.G0);
                return;
            }
            case 0: {
                ((lbz)this.E0).a.f();
                if (((qay)this.F0).F0.r() == null) {
                    ((lbz)this.E0).a.n((qay)this.F0, (twz)this.G0);
                }
                else {
                    ((lbz)this.E0).a.r((qay)this.F0, (twz)this.G0);
                }
            }
        }
    }
}
