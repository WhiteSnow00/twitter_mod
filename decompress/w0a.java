import java.util.List;
import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public final class w0a
{
    public final Resources a;
    
    public w0a(final Resources a) {
        this.a = a;
    }
    
    public final irp$c a(final String s, int a, final boolean b) {
        final irp$c$a irp$c$a = new irp$c$a();
        irp$c$a.a = s;
        irp$c$a.b = this.a.getString(a);
        irp$c$a.g = "on_off";
        irp$c$a.h = ojf.v((Object)kkg.o((Object)"on", (Object)"on"));
        final ged$b g0 = ged.G0;
        a = o5j.a;
        irp$c$a.i = (List)g0;
        irp$c$a.k = s;
        if (b) {
            irp$c$a.d = "vit-only";
        }
        return (irp$c)((z4j)irp$c$a).e();
    }
}
