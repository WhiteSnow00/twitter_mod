import java.util.Objects;
import com.twitter.nft.subsystem.model.Web3Wallet;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public interface y4i
{
    public static final a Companion = a.a;
    
    void a(final Context p0, final fci<?> p1);
    
    void b(final Context p0, final fci<?> p1, final Web3Wallet p2);
    
    void c(final Context p0, final fci<?> p1);
    
    public static final class a
    {
        public static final a a;
        
        static {
            a = new a();
        }
        
        public final y4i a() {
            Objects.requireNonNull(mki.Companion);
            return ((mki)dgw.Companion.a().c((Class)mki.class)).q2();
        }
    }
}
