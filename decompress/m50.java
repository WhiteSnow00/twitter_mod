// 
// Decompiled by Procyon v0.6.0
// 

public final class m50 implements vok
{
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        Class<?> class1;
        if (o != null) {
            class1 = o.getClass();
        }
        else {
            class1 = null;
        }
        if (!zzd.a((Object)m50.class, (Object)class1)) {
            return false;
        }
        zzd.d(o, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIcon");
        final m50 m50 = (m50)o;
        return zzd.a((Object)null, (Object)null);
    }
    
    @Override
    public final int hashCode() {
        throw null;
    }
    
    @Override
    public final String toString() {
        return "AndroidPointerIcon(pointerIcon=null)";
    }
}
