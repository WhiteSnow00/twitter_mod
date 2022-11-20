import android.os.BaseBundle;
import android.content.Intent;
import java.util.Collection;
import java.util.ArrayList;
import android.os.Bundle;
import android.app.PendingIntent;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class o2r
{
    public static o2r b(final int n, final int n2, final int n3, final long n4, final long n5, final List<String> list, final List<String> list2) {
        if (n2 != 8) {
            return (o2r)new j9y(n, n2, n3, n4, n5, (List)list, (List)list2, (PendingIntent)null, (List)null);
        }
        throw new IllegalArgumentException("REQUIRES_USER_CONFIRMATION state not supported.");
    }
    
    public static o2r m(final Bundle bundle) {
        return (o2r)new j9y(((BaseBundle)bundle).getInt("session_id"), ((BaseBundle)bundle).getInt("status"), ((BaseBundle)bundle).getInt("error_code"), ((BaseBundle)bundle).getLong("bytes_downloaded"), ((BaseBundle)bundle).getLong("total_bytes_to_download"), (List)bundle.getStringArrayList("module_names"), (List)bundle.getStringArrayList("languages"), (PendingIntent)bundle.getParcelable("user_confirmation_intent"), (List)bundle.getParcelableArrayList("split_file_intents"));
    }
    
    public abstract long a();
    
    public abstract int c();
    
    public final List<String> d() {
        ArrayList list;
        if (this.j() != null) {
            list = new ArrayList((Collection<? extends E>)this.j());
        }
        else {
            list = new ArrayList();
        }
        return list;
    }
    
    public final List<String> e() {
        ArrayList list;
        if (this.k() != null) {
            list = new ArrayList((Collection<? extends E>)this.k());
        }
        else {
            list = new ArrayList();
        }
        return list;
    }
    
    @Deprecated
    public abstract PendingIntent f();
    
    public abstract int g();
    
    public abstract int h();
    
    public abstract long i();
    
    public abstract List<String> j();
    
    public abstract List<String> k();
    
    public abstract List<Intent> l();
}
