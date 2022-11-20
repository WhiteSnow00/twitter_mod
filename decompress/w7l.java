import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class w7l extends ste implements qsb<Map<String, ? extends egw>, egw>
{
    public final long D0;
    
    public w7l(final long d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(Object value) {
        final Map map = (Map)value;
        czd.f((Object)map, "it");
        if ((value = map.get(String.valueOf(this.D0))) == null) {
            value = new egw((ggw)null, (kgw)null);
        }
        return value;
    }
}
