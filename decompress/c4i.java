import java.util.Objects;
import com.twitter.nft.subsystem.model.Web3Wallet;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public interface c4i
{
    public static final a Companion = a.a;
    
    void a(final Context p0, final mbi<?> p1);
    
    void b(final Context p0, final mbi<?> p1, final Web3Wallet p2);
    
    void c(final Context p0, final mbi<?> p1);
    
    public static final class a
    {
        public static final /* synthetic */ a a;
        
        static {
            a = new a();
        }
        
        public final c4i a() {
            Objects.requireNonNull(sji.Companion);
            return ((sji)afw.Companion.a().c((Class)sji.class)).q2();
        }
    }
}
