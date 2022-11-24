// 
// Decompiled by Procyon v0.6.0
// 

public final class puo
{
    public static final ouo<Object, Object> a;
    
    static {
        puo.a = (puo$c)a((hub<? super quo, ? super Object, ?>)puo$a.F0, (stb<? super Object, ?>)puo$b.F0);
    }
    
    public static final <Original, Saveable> ouo<Original, Saveable> a(final hub<? super quo, ? super Original, ? extends Saveable> hub, final stb<? super Saveable, ? extends Original> stb) {
        e0e.f((Object)hub, "save");
        e0e.f((Object)stb, "restore");
        return (ouo<Original, Saveable>)new ouo<Original, Saveable>(hub, stb) {
            public final hub<quo, Original, Saveable> a;
            public final stb<Saveable, Original> b;
            
            public final Saveable a(final quo quo, final Original original) {
                e0e.f((Object)quo, "<this>");
                return (Saveable)this.a.invoke((Object)quo, (Object)original);
            }
            
            public final Original b(final Saveable saveable) {
                return (Original)this.b.invoke((Object)saveable);
            }
        };
    }
}
