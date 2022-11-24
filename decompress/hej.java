import android.os.Parcelable;
import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hej extends aj1
{
    public hej(final Intent intent) {
        super(intent);
    }
    
    public static a a() {
        final a a = new a();
        a.a.putExtra("extra_should_finish", true);
        a.a.setFlags(67108864);
        return a;
    }
    
    public static a b(final Intent intent) {
        final a a = new a();
        if (intent != null) {
            a.a.putExtra("extra_destination_intent", (Parcelable)intent);
        }
        else {
            a.a.removeExtra("extra_destination_intent");
        }
        return a;
    }
    
    public static final class a extends aj1.a<hej, a>
    {
        public final Object i() {
            return new hej(super.a);
        }
    }
}
