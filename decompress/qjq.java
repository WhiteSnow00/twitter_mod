import java.util.LinkedHashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qjq extends ste implements qsb<rhh$a<wpq>, fzv>
{
    public final njq D0;
    
    public qjq(final njq d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final rhh$a rhh$a = (rhh$a)o;
        czd.f((Object)rhh$a, "$this$watch");
        final pjq pjq = new pjq(this.D0);
        final LinkedHashMap b = rhh$a.b;
        final rhh$a rhh$a2 = new rhh$a();
        pjq.invoke((Object)rhh$a2);
        b.put(wpq.class, rhh$a2.b());
        return fzv.a;
    }
}
