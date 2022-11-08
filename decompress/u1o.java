import com.twitter.rooms.manager.RoomScheduleSpaceDelegate;
import retrofit2.HttpException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class u1o implements m5k$d
{
    public final /* synthetic */ raq<r57> a;
    
    public u1o(final raq<r57> a) {
        this.a = a;
    }
    
    public final void a(final r57 r57) {
        ((y9q$a)this.a).b((Object)r57);
    }
    
    public final void b(HttpException ex) {
        final raq<r57> a = this.a;
        if (ex == null) {
            ex = (HttpException)new RoomScheduleSpaceDelegate.CreateScheduledSpaceException();
        }
        ((y9q$a)a).a((Throwable)ex);
    }
}
