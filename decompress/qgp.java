// 
// Decompiled by Procyon v0.6.0
// 

public final class qgp
{
    public static final <T> T a(final pgp pgp, final ehp<T> ehp) {
        czd.f((Object)pgp, "<this>");
        czd.f((Object)ehp, "key");
        czd.f((Object)qgp$a.D0, "defaultValue");
        T value;
        if ((value = pgp.D0.get(ehp)) == null) {
            value = null;
        }
        return value;
    }
}
