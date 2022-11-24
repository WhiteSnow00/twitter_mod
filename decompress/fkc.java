import java.util.List;
import tv.periscope.android.api.service.payman.response.GetGiftsCatalogResponse;
import retrofit2.Retrofit;
import tv.periscope.retrofit.RetrofitException;
import retrofit2.Response;
import tv.periscope.android.api.UnfollowResponse;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fkc implements rtb
{
    public static final fkc G0;
    public static final fkc H0;
    public static final fkc I0;
    public static final fkc J0;
    public static final fkc K0;
    public static final fkc L0;
    public static final fkc M0;
    public static final fkc N0;
    public static final fkc O0;
    public static final fkc P0;
    public static final fkc Q0;
    public static final fkc R0;
    public final int F0;
    
    static {
        G0 = new fkc(0);
        H0 = new fkc(1);
        I0 = new fkc(2);
        J0 = new fkc(3);
        K0 = new fkc(4);
        L0 = new fkc(5);
        M0 = new fkc(6);
        N0 = new fkc(7);
        O0 = new fkc(8);
        P0 = new fkc(9);
        Q0 = new fkc(10);
        R0 = new fkc(11);
    }
    
    public fkc(final int f0) {
        this.F0 = f0;
    }
    
    public final Object apply(final Object o) {
        switch (this.F0) {
            default: {
                final UnfollowResponse unfollowResponse = (UnfollowResponse)o;
                return t5j.empty();
            }
            case 10: {
                final Response response = (Response)o;
                t5j t5j;
                if (!response.isSuccessful()) {
                    t5j = t5j.error((Throwable)RetrofitException.c((String)null, response, (Retrofit)null));
                }
                else {
                    t5j = t5j.just((Object)response.body());
                }
                return t5j;
            }
            case 9: {
                return t5j.just((Object)((GetGiftsCatalogResponse)o).gifts);
            }
            case 8: {
                return kni.a;
            }
            case 7: {
                return ((gcu$e)o).b;
            }
            case 6: {
                return noj.b((Object)((xzu)o).a.U0);
            }
            case 5: {
                return ((iuu)o).k;
            }
            case 4: {
                return ((noj)o).c();
            }
            case 3: {
                return new tkd((List)o);
            }
            case 2: {
                return btm.e((Object)((noj)o).c());
            }
            case 1: {
                return new noj((Object)o);
            }
            case 0: {
                return ((noj)o).c();
            }
        }
    }
}
