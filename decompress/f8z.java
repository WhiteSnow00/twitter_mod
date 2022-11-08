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

public final class f8z implements Runnable
{
    public final /* synthetic */ int C0;
    public final /* synthetic */ Object D0 = d0;
    public final /* synthetic */ Object E0 = e0;
    public final /* synthetic */ Object F0 = f0;
    
    @Override
    public final void run() {
        switch (this.C0) {
            default: {
                final dsa dsa = (dsa)this.E0;
                final List list = (List)this.F0;
                final List list2 = (List)this.D0;
                Objects.requireNonNull(dsa);
                final ArrayList list3 = new ArrayList();
                final ArrayList list4 = new ArrayList();
                for (final File file : list) {
                    final String q = x3j.Q(file);
                    final Uri fromFile = Uri.fromFile(file);
                    final Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setDataAndType(fromFile, dsa.b.getContentResolver().getType(fromFile));
                    intent.addFlags(1);
                    intent.putExtra("module_name", dsa.j(q));
                    intent.putExtra("split_id", q);
                    list3.add(intent);
                    list4.add(dsa.j(x3j.Q(file)));
                }
                final v1r g = dsa.g();
                if (g != null) {
                    dsa.h.execute((Runnable)new ddz(dsa, g.i(), (List)list3, (List)list4, list2));
                }
                return;
            }
            case 1: {
                ((waz)this.D0).a.f();
                ((waz)this.D0).a.j((hgy)this.E0, (String)this.F0);
                return;
            }
            case 0: {
                ((waz)this.D0).a.f();
                if (((aay)this.E0).E0.r() == null) {
                    ((waz)this.D0).a.n((aay)this.E0, (hwz)this.F0);
                }
                else {
                    ((waz)this.D0).a.r((aay)this.E0, (hwz)this.F0);
                }
            }
        }
    }
}
