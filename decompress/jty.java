import java.util.ArrayList;
import android.os.Bundle;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;
import java.util.Map;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jty
{
    public static final v3a g;
    public final tjy a;
    public final dqy<l000> b;
    public final cqy c;
    public final dqy<Executor> d;
    public final Map<Integer, wsy> e;
    public final ReentrantLock f;
    
    static {
        g = new v3a("ExtractorSessionStoreView");
    }
    
    public jty(final tjy a, final dqy<l000> b, final cqy c, final dqy<Executor> d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = new HashMap();
        this.f = new ReentrantLock();
    }
    
    public static String d(final Bundle bundle) {
        final ArrayList stringArrayList = bundle.getStringArrayList("pack_names");
        if (stringArrayList != null && !stringArrayList.isEmpty()) {
            return (String)stringArrayList.get(0);
        }
        throw new kpy("Session without pack received.");
    }
    
    public final void a() {
        this.f.unlock();
    }
    
    public final wsy b(final int n) {
        final HashMap e = this.e;
        final Integer value = n;
        final wsy wsy = e.get(value);
        if (wsy != null) {
            return wsy;
        }
        throw new kpy(String.format("Could not find session %d while trying to get it", value), n);
    }
    
    public final <T> T c(final gty<T> gty) {
        try {
            this.f.lock();
            return gty.a();
        }
        finally {
            this.f.unlock();
        }
    }
}
