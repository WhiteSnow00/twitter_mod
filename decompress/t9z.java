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

public final class t9z implements Runnable
{
    public final int F0;
    public final Object G0;
    public final Object H0;
    public final Object I0;
    
    public t9z(final isa h0, final List i0, final List g0) {
        this.F0 = 2;
        this.H0 = h0;
        this.I0 = i0;
        this.G0 = g0;
    }
    
    public t9z(final kcz g0, final sd h0, final Object i0, final int f0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
    }
    
    @Override
    public final void run() {
        switch (this.F0) {
            default: {
                final isa isa = (isa)this.H0;
                final List list = (List)this.I0;
                final List list2 = (List)this.G0;
                Objects.requireNonNull(isa);
                final ArrayList list3 = new ArrayList();
                final ArrayList list4 = new ArrayList();
                for (final File file : list) {
                    final String y = ak1.Y(file);
                    final Uri fromFile = Uri.fromFile(file);
                    final Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setDataAndType(fromFile, isa.b.getContentResolver().getType(fromFile));
                    intent.addFlags(1);
                    intent.putExtra("module_name", isa.j(y));
                    intent.putExtra("split_id", y);
                    list3.add(intent);
                    list4.add(isa.j(ak1.Y(file)));
                }
                final n3r g = isa.g();
                if (g != null) {
                    isa.h.execute(new rez(isa, g.i(), list3, list4, list2));
                }
                return;
            }
            case 1: {
                ((kcz)this.G0).a.f();
                ((kcz)this.G0).a.j((rhy)this.H0, (String)this.I0);
                return;
            }
            case 0: {
                ((kcz)this.G0).a.f();
                if (((kby)this.H0).H0.p() == null) {
                    ((kcz)this.G0).a.n((kby)this.H0, (sxz)this.I0);
                }
                else {
                    ((kcz)this.G0).a.r((kby)this.H0, (sxz)this.I0);
                }
            }
        }
    }
}
