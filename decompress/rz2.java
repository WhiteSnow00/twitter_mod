import com.twitter.business.api.ValidationType;
import kotlin.NoWhenBranchMatchedException;
import java.util.Objects;
import com.twitter.profilemodules.model.business.CountryIso;
import com.twitter.business.moduleconfiguration.businessinfo.util.inputtext.BusinessInputTextType;
import com.twitter.business.api.BusinessInputTextContentViewResult;
import com.twitter.business.api.BusinessInputTextContentViewArgs;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rz2
{
    public final yz2 a;
    public final sz2 b;
    public final dn6<BusinessInputTextContentViewArgs, BusinessInputTextContentViewResult> c;
    
    public rz2(final obi<?> obi, final yz2 a, final sz2 b) {
        czd.f((Object)obi, "navigator");
        czd.f((Object)a, "inputTextValueSelector");
        czd.f((Object)b, "serializer");
        this.a = a;
        this.b = b;
        this.c = (dn6<BusinessInputTextContentViewArgs, BusinessInputTextContentViewResult>)obi.a((Class)BusinessInputTextContentViewResult.class);
    }
    
    public final h5j<qz2> a() {
        final h5j map = this.c.c().map((psb)new x9v((qsb)new rz2$a(this), 16));
        czd.e((Object)map, "fun observeSuccess(): Ob\u2026extValue)\n        }\n    }");
        return (h5j<qz2>)map;
    }
    
    public final void b(final BusinessInputTextType businessInputTextType, String s, final CountryIso countryIso) {
        czd.f((Object)businessInputTextType, "type");
        final dn6<BusinessInputTextContentViewArgs, BusinessInputTextContentViewResult> c = this.c;
        Objects.requireNonNull(this.b);
        final String name = businessInputTextType.name();
        String s2;
        if (s == null) {
            s2 = "";
        }
        else {
            s2 = s;
        }
        final yz2 a = this.a;
        Objects.requireNonNull(a);
        final int[] a2 = yz2.a.a;
        final int n = a2[businessInputTextType.ordinal()];
        final int n2 = 2131954432;
        int n3 = 0;
        switch (n) {
            default: {
                throw new NoWhenBranchMatchedException();
            }
            case 7: {
                n3 = 2131954428;
                break;
            }
            case 6: {
                n3 = 2131954429;
                break;
            }
            case 5: {
                n3 = 2131954435;
                break;
            }
            case 4: {
                n3 = 2131954427;
                break;
            }
            case 3: {
                n3 = 2131954432;
                break;
            }
            case 2: {
                n3 = 2131954433;
                break;
            }
            case 1: {
                n3 = 2131954430;
                break;
            }
        }
        final String string = a.a.getString(n3);
        czd.e((Object)string, "when (screenType) {\n    \u2026{ context.getString(it) }");
        final yz2 a3 = this.a;
        Objects.requireNonNull(a3);
        int n4 = 0;
        switch (a2[businessInputTextType.ordinal()]) {
            default: {
                throw new NoWhenBranchMatchedException();
            }
            case 7: {
                n4 = 2131954402;
                break;
            }
            case 6: {
                n4 = 2131954408;
                break;
            }
            case 5: {
                n4 = 2131954442;
                break;
            }
            case 4: {
                n4 = 2131954400;
                break;
            }
            case 3: {
                n4 = 2131954422;
                break;
            }
            case 2: {
                n4 = 2131954438;
                break;
            }
            case 1: {
                n4 = 2131954413;
                break;
            }
        }
        final String string2 = a3.a.getString(n4);
        czd.e((Object)string2, "when (screenType) {\n    \u2026{ context.getString(it) }");
        final yz2 a4 = this.a;
        Objects.requireNonNull(a4);
        int n5 = 0;
        switch (a2[businessInputTextType.ordinal()]) {
            default: {
                throw new NoWhenBranchMatchedException();
            }
            case 7: {
                n5 = 2131954401;
                break;
            }
            case 6: {
                n5 = 2131954407;
                break;
            }
            case 5: {
                n5 = 2131954440;
                break;
            }
            case 4: {
                n5 = 2131954399;
                break;
            }
            case 3: {
                n5 = 2131954421;
                break;
            }
            case 2: {
                n5 = 2131954437;
                break;
            }
            case 1: {
                n5 = 2131954412;
                break;
            }
        }
        final String string3 = a4.a.getString(n5);
        czd.e((Object)string3, "when (screenType) {\n    \u2026{ context.getString(it) }");
        Objects.requireNonNull(this.a);
        int n6 = 0;
        switch (a2[businessInputTextType.ordinal()]) {
            default: {
                throw new NoWhenBranchMatchedException();
            }
            case 5: {
                n6 = 4097;
                break;
            }
            case 4:
            case 6:
            case 7: {
                n6 = 8193;
                break;
            }
            case 3: {
                n6 = 3;
                break;
            }
            case 2: {
                n6 = 208;
                break;
            }
            case 1: {
                n6 = 32;
                break;
            }
        }
        final yz2 a5 = this.a;
        Objects.requireNonNull(a5);
        int n7 = n2;
        while (true) {
            switch (a2[businessInputTextType.ordinal()]) {
                default: {
                    throw new NoWhenBranchMatchedException();
                }
                case 3: {
                    final String string4 = a5.a.getString(n7);
                    czd.e((Object)string4, "when (screenType) {\n    \u2026{ context.getString(it) }");
                    final yz2 a6 = this.a;
                    Objects.requireNonNull(a6);
                    String string5;
                    if (a2[businessInputTextType.ordinal()] == 1) {
                        string5 = a6.a.getString(2131953795);
                    }
                    else {
                        string5 = null;
                    }
                    Objects.requireNonNull(ex2.Companion);
                    switch (ex2$a$a.a[businessInputTextType.ordinal()]) {
                        default: {
                            throw new NoWhenBranchMatchedException();
                        }
                        case 7: {
                            s = "about_module_admin_area_settings";
                            break;
                        }
                        case 6: {
                            s = "about_module_city_settings";
                            break;
                        }
                        case 5: {
                            s = "about_module_zipcode_settings";
                            break;
                        }
                        case 4: {
                            s = "about_module_street_address_settings";
                            break;
                        }
                        case 3: {
                            s = "about_module_phone_input_settings";
                            break;
                        }
                        case 2: {
                            s = "about_module_website_settings";
                            break;
                        }
                        case 1: {
                            s = "about_module_email_settings";
                            break;
                        }
                    }
                    Objects.requireNonNull(this.a);
                    final int n8 = a2[businessInputTextType.ordinal()];
                    Object instance = null;
                    Label_0893: {
                        if (n8 != 1) {
                            if (n8 != 2) {
                                if (n8 == 3) {
                                    if (countryIso != null) {
                                        instance = new ValidationType.Phone(countryIso.getIsoString());
                                        break Label_0893;
                                    }
                                }
                                instance = null;
                            }
                            else {
                                instance = new ValidationType.Website(false);
                            }
                        }
                        else {
                            instance = ValidationType.Email.INSTANCE;
                        }
                    }
                    c.d((Object)new BusinessInputTextContentViewArgs(name, s2, string, string2, string3, 0, n6, string4, string5, null, s, (ValidationType)instance, 512, null));
                    return;
                }
                case 7: {
                    n7 = 2131954428;
                    continue;
                }
                case 6: {
                    n7 = 2131954429;
                    continue;
                }
                case 5: {
                    n7 = 2131954435;
                    continue;
                }
                case 4: {
                    n7 = 2131954427;
                    continue;
                }
                case 2: {
                    n7 = 2131954433;
                    continue;
                }
                case 1: {
                    n7 = 2131954430;
                    continue;
                }
            }
            break;
        }
    }
}
