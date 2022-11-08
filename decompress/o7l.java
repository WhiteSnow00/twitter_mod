import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class o7l extends gue implements rtb<Map<String, ? extends lfw>, lfw>
{
    public final /* synthetic */ long C0;
    
    public o7l(final long c0) {
        this.C0 = c0;
        super(1);
    }
    
    public final Object invoke(Object value) {
        final Map map = (Map)value;
        zzd.f((Object)map, "it");
        if ((value = map.get(String.valueOf(this.C0))) == null) {
            value = new lfw((nfw)null, (rfw)null);
        }
        return value;
    }
}
