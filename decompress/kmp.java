import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class kmp
{
    public static final rlp<kmp> b;
    public final String a;
    
    static {
        kmp.b = (nw6)lw6.b(new glp[] { new glp((Class)ywm.class, (rlp)new ywm$a()), new glp((Class)buk.class, (rlp)new buk$a()) });
    }
    
    public kmp(final String a) {
        this.a = a;
    }
    
    public final Map<String, String> a(final Map<String, String> map, final Map<String, String> map2) {
        final qjg$a qjg$a = new qjg$a(map2.size() + map.size());
        ((qjg)qjg$a).x((Map)map);
        ((qjg)qjg$a).x((Map)map2);
        return (Map)((n4j)qjg$a).e();
    }
    
    public abstract kmp b(final Map<String, String> p0);
}
