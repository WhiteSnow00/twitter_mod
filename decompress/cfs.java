import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cfs extends ste implements qsb<List<yis>, Boolean>
{
    public final bfs D0;
    
    public cfs(final bfs d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final List list = (List)o;
        czd.f((Object)list, "it");
        final yis f = this.D0.D0.f;
        boolean b;
        if (f != null) {
            list.add(f);
            b = true;
        }
        else {
            b = false;
        }
        return b;
    }
}
