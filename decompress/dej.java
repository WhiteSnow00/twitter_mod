import android.os.Parcelable;
import android.content.Intent;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dej
{
    public final Context a;
    public final fds b;
    public final Intent c;
    public final int d;
    public final boolean e;
    
    public dej(final a a) {
        this.a = a.a;
        final fds d = a.d;
        vmw.g((Object)d);
        this.b = d;
        this.c = a.b;
        this.d = a.c;
        this.e = a.e;
    }
    
    public final Intent a() {
        return fn.a().a(this.a, (cn)this.b());
    }
    
    public final hej b() {
        final Intent a = fn.a().a(this.a, (cn)hej.a().e());
        final fds b = this.b;
        final vej$a vej$a = new vej$a();
        if (a != null) {
            ((aj1.a)vej$a).a.putExtra("extra_original_activity_intent", (Parcelable)a);
        }
        else {
            ((aj1.a)vej$a).a.removeExtra("extra_original_activity_intent");
        }
        swj.c(((aj1.a)vej$a).a, "extra_task_query", (Object)b, (nmp)fds.m);
        final Intent c = this.c;
        if (c != null) {
            ((aj1.a)vej$a).a.putExtra("extra_fallback_activity_intent", (Parcelable)c);
        }
        else {
            ((aj1.a)vej$a).a.removeExtra("extra_fallback_activity_intent");
        }
        ((aj1.a)vej$a).a.putExtra("extra_max_loading_timeout", this.d);
        final hej.a b2 = hej.b(fn.a().a(this.a, (cn)((z4j)vej$a).e()));
        b2.a.putExtra("extra_single_instance", this.e);
        return (hej)b2.e();
    }
    
    public static final class a extends z4j<dej>
    {
        public final Context a;
        public Intent b;
        public int c;
        public fds d;
        public boolean e;
        
        public a(final Context a) {
            this.c = -1;
            this.a = a;
        }
        
        public final Object i() {
            return new dej(this);
        }
        
        public final boolean k() {
            return this.d != null;
        }
    }
}
