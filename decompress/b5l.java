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

public final class b5l implements JsonModelRegistry$Registrar
{
    public final void a(final JsonModelRegistry$b jsonModelRegistry$b) {
        final zgd h = zgd.h;
        final JsonModelRegistry$a jsonModelRegistry$a = (JsonModelRegistry$a)jsonModelRegistry$b;
        jsonModelRegistry$a.b((Class)j7.class, (Class)JsonAboutModuleConfigInputSimplifiedInput.class, (ypa)h);
        jsonModelRegistry$a.b((Class)jt2.class, (Class)JsonBusinessAddressInput.class, (ypa)si4.o);
        jsonModelRegistry$a.b((Class)nu2.class, (Class)JsonBusinessContactEmailInput.class, (ypa)n1x.k);
        jsonModelRegistry$a.b((Class)ou2.class, (Class)JsonBusinessContactInput.class, (ypa)mof.j);
        jsonModelRegistry$a.b((Class)qu2.class, (Class)JsonBusinessContactPhoneInput.class, (ypa)bhd.j);
        jsonModelRegistry$a.b((Class)uu2.class, (Class)JsonBusinessGeoInput.class, (ypa)c2x.h);
        jsonModelRegistry$a.b((Class)u13.class, (Class)JsonBusinessOpenTimesInput.class, (ypa)b2x.j);
        jsonModelRegistry$a.b((Class)w13.class, (Class)JsonBusinessOpenTimesRegularInput.class, (ypa)a2x.i);
        jsonModelRegistry$a.b((Class)y13.class, (Class)JsonBusinessOpenTimesRegularSlotInput.class, (ypa)zgd.i);
        jsonModelRegistry$a.b((Class)k33.class, (Class)JsonBusinessTimezoneInput.class, (ypa)o1x.p);
        jsonModelRegistry$a.b((Class)l33.class, (Class)JsonBusinessVenueInput.class, (ypa)o1x.o);
        jsonModelRegistry$a.b((Class)m33.class, (Class)JsonBusinessWebsiteInput.class, (ypa)t41.m);
        jsonModelRegistry$a.b((Class)qlh.class, (Class)JsonModuleForDisplay.class, (ypa)null);
        jsonModelRegistry$a.b((Class)f9w.class, (Class)JsonUserBusinessConfigurableModuleV1.class, (ypa)null);
        jsonModelRegistry$a.b((Class)g9w.class, (Class)JsonUserBusinessEditableModuleV1.class, (ypa)null);
        jsonModelRegistry$a.b((Class)h9w.class, (Class)JsonUserBusinessEditableModules.class, (ypa)null);
        jsonModelRegistry$a.c((Class)rfw.class, (TypeConverter)new mke());
        jsonModelRegistry$a.c((Class)gbl.class, (TypeConverter)new lke());
    }
}
