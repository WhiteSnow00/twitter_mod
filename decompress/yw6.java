import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yw6 extends ste implements qsb<List<yis>, Boolean>
{
    public final xhs D0;
    
    public yw6(final xhs d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final List list = (List)o;
        czd.f((Object)list, "it");
        boolean b;
        if (this.D0.c() != null) {
            final zis c = this.D0.c();
            czd.c((Object)c);
            list.add(c.a);
            b = true;
        }
        else {
            b = false;
        }
        return b;
    }
}
