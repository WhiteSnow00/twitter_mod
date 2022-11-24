import com.bluelinelabs.logansquare.typeconverters.TypeConverter;
import com.twitter.professional.json.business.JsonUserBusinessEditableModules;
import com.twitter.professional.json.business.JsonUserBusinessEditableModuleV1;
import com.twitter.professional.json.business.JsonUserBusinessConfigurableModuleV1;
import com.twitter.professional.json.business.JsonModuleForDisplay;
import com.twitter.professional.json.business.JsonBusinessWebsiteInput;
import com.twitter.professional.json.business.JsonBusinessVenueInput;
import com.twitter.professional.json.business.JsonBusinessTimezoneInput;
import com.twitter.professional.json.business.JsonBusinessOpenTimesRegularSlotInput;
import com.twitter.professional.json.business.JsonBusinessOpenTimesRegularInput;
import com.twitter.professional.json.business.JsonBusinessOpenTimesInput;
import com.twitter.professional.json.business.JsonBusinessGeoInput;
import com.twitter.professional.json.business.JsonBusinessContactPhoneInput;
import com.twitter.professional.json.business.JsonBusinessContactInput;
import com.twitter.professional.json.business.JsonBusinessContactEmailInput;
import com.twitter.professional.json.business.JsonBusinessAddressInput;
import com.twitter.professional.json.business.JsonAboutModuleConfigInputSimplifiedInput;
import com.twitter.model.json.common.JsonModelRegistry$a;
import com.twitter.model.json.common.JsonModelRegistry$b;
import com.twitter.model.json.common.JsonModelRegistry$Registrar;

// 
// Decompiled by Procyon v0.6.0
// 

public final class q5l implements JsonModelRegistry$Registrar
{
    public final void a(final JsonModelRegistry$b jsonModelRegistry$b) {
        final jpf i = jpf.i;
        final JsonModelRegistry$a jsonModelRegistry$a = (JsonModelRegistry$a)jsonModelRegistry$b;
        jsonModelRegistry$a.b((Class)i7.class, (Class)JsonAboutModuleConfigInputSimplifiedInput.class, (gra)i);
        jsonModelRegistry$a.b((Class)bu2.class, (Class)JsonBusinessAddressInput.class, (gra)f2x.l);
        jsonModelRegistry$a.b((Class)fv2.class, (Class)JsonBusinessContactEmailInput.class, (gra)t2x.j);
        jsonModelRegistry$a.b((Class)gv2.class, (Class)JsonBusinessContactInput.class, (gra)zhd.i);
        jsonModelRegistry$a.b((Class)iv2.class, (Class)JsonBusinessContactPhoneInput.class, (gra)e2x.j);
        jsonModelRegistry$a.b((Class)mv2.class, (Class)JsonBusinessGeoInput.class, (gra)z41.j);
        jsonModelRegistry$a.b((Class)n23.class, (Class)JsonBusinessOpenTimesInput.class, (gra)xj4.m);
        jsonModelRegistry$a.b((Class)p23.class, (Class)JsonBusinessOpenTimesRegularInput.class, (gra)u2x.j);
        jsonModelRegistry$a.b((Class)r23.class, (Class)JsonBusinessOpenTimesRegularSlotInput.class, (gra)jpf.j);
        jsonModelRegistry$a.b((Class)d43.class, (Class)JsonBusinessTimezoneInput.class, (gra)bid.p);
        jsonModelRegistry$a.b((Class)e43.class, (Class)JsonBusinessVenueInput.class, (gra)bid.o);
        jsonModelRegistry$a.b((Class)f43.class, (Class)JsonBusinessWebsiteInput.class, (gra)v2x.k);
        jsonModelRegistry$a.b((Class)fmh.class, (Class)JsonModuleForDisplay.class, (gra)null);
        jsonModelRegistry$a.b((Class)v9w.class, (Class)JsonUserBusinessConfigurableModuleV1.class, (gra)null);
        jsonModelRegistry$a.b((Class)w9w.class, (Class)JsonUserBusinessEditableModuleV1.class, (gra)null);
        jsonModelRegistry$a.b((Class)x9w.class, (Class)JsonUserBusinessEditableModules.class, (gra)null);
        jsonModelRegistry$a.c((Class)hgw.class, (TypeConverter)new jle());
        jsonModelRegistry$a.c((Class)tbl.class, (TypeConverter)new hle());
    }
}
