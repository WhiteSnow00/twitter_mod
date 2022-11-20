import android.os.Parcelable;
import android.content.Intent;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qdj
{
    public final Context a;
    public final ncs b;
    public final Intent c;
    public final int d;
    public final boolean e;
    
    public qdj(final a a) {
        this.a = a.a;
        final ncs d = a.d;
        jee.l((Object)d);
        this.b = d;
        this.c = a.b;
        this.d = a.c;
        this.e = a.e;
    }
    
    public final Intent a() {
        return an.a().a(this.a, this.b());
    }
    
    public final udj b() {
        final Intent a = an.a().a(this.a, ((n4j)udj.a()).e());
        final ncs b = this.b;
        final jej$a jej$a = new jej$a();
        if (a != null) {
            ((xi1.a)jej$a).a.putExtra("extra_original_activity_intent", (Parcelable)a);
        }
        else {
            ((xi1.a)jej$a).a.removeExtra("extra_original_activity_intent");
        }
        dwj.c(((xi1.a)jej$a).a, "extra_task_query", (Object)b, (rlp)ncs.m);
        final Intent c = this.c;
        if (c != null) {
            ((xi1.a)jej$a).a.putExtra("extra_fallback_activity_intent", (Parcelable)c);
        }
        else {
            ((xi1.a)jej$a).a.removeExtra("extra_fallback_activity_intent");
        }
        ((xi1.a)jej$a).a.putExtra("extra_max_loading_timeout", this.d);
        final udj$a b2 = udj.b(an.a().a(this.a, ((n4j)jej$a).e()));
        ((xi1.a)b2).a.putExtra("extra_single_instance", this.e);
        return (udj)((n4j)b2).e();
    }
    
    public static final class a extends n4j<qdj>
    {
        public final Context a;
        public Intent b;
        public int c;
        public ncs d;
        public boolean e;
        
        public a(final Context a) {
            this.c = -1;
            this.a = a;
        }
        
        public final Object i() {
            return new qdj(this);
        }
        
        public final boolean l() {
            return this.d != null;
        }
    }
}
