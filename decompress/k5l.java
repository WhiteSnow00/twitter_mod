import kotlin.NoWhenBranchMatchedException;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class k5l
{
    public static final a Companion;
    public final UserIdentifier a;
    
    static {
        Companion = new a();
    }
    
    public k5l(final UserIdentifier a) {
        czd.f((Object)a, "userIdentifier");
        this.a = a;
    }
    
    public final void a(final vba vba) {
        final af4 af4 = new af4(vba);
        ((u0p)af4).r = this.a;
        final int a = c5j.a;
        cbw.b((elm)af4);
    }
    
    public final void b(final int n) {
        da8.m(n, "requestType");
        this.a(k5l.Companion.a(n, "request_failure"));
    }
    
    public final void c(final int n) {
        da8.m(n, "requestType");
        this.a(k5l.Companion.a(n, "request_started"));
    }
    
    public final void d(final int n) {
        da8.m(n, "requestType");
        this.a(k5l.Companion.a(n, "request_success"));
    }
    
    public static final class a
    {
        public final vba a(final int n, final String s) {
            da8.m(n, "requestType");
            final vba$a companion = vba.Companion;
            if (n != 0) {
                String s2 = null;
                switch (n - 1) {
                    default: {
                        throw new NoWhenBranchMatchedException();
                    }
                    case 13: {
                        s2 = "generate_maps_image_request";
                        break;
                    }
                    case 12: {
                        s2 = "update_mobile_app_module_request";
                        break;
                    }
                    case 11: {
                        s2 = "create_mobile_app_module_request";
                        break;
                    }
                    case 10: {
                        s2 = "delete_mobile_app_module_request";
                        break;
                    }
                    case 9: {
                        s2 = "update_link_module_request";
                        break;
                    }
                    case 8: {
                        s2 = "create_link_module_request";
                        break;
                    }
                    case 7: {
                        s2 = "delete_link_module_request";
                        break;
                    }
                    case 6: {
                        s2 = "update_about_module_from_venue_request";
                        break;
                    }
                    case 5: {
                        s2 = "create_about_module_from_venue_request";
                        break;
                    }
                    case 4: {
                        s2 = "delete_about_module_and_venue_request";
                        break;
                    }
                    case 3: {
                        s2 = "update_category_display_request";
                        break;
                    }
                    case 2: {
                        s2 = "update_to_creator_request";
                        break;
                    }
                    case 1: {
                        s2 = "update_to_business_request";
                        break;
                    }
                    case 0: {
                        s2 = "update_to_personal_request";
                        break;
                    }
                }
                return companion.e("professional_settings", "switch_account", "", s2, s);
            }
            throw null;
        }
    }
}
