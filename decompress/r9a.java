import java.util.Objects;
import java.util.LinkedHashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class r9a
{
    public final Map<String, y8r> a;
    
    public r9a(final oo9 oo9) {
        czd.f((Object)oo9, "eadPromotedReporter");
        this.a = new LinkedHashMap();
        final t19 subscribe = ((h5j)oo9.b).subscribeOn(owo.c()).subscribe((lj6)new q9a((qsb)new r9a$a(this), 0));
        Objects.requireNonNull(subscribe, "disposable is null");
        try {
            new imj(16, 0.75f).a((Object)subscribe);
        }
        finally {}
    }
}
