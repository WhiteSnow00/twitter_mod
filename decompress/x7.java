import com.twitter.profilemodules.model.business.Weekday;
import java.util.Iterator;
import com.twitter.business.model.hours.BusinessHoursData;
import com.twitter.business.model.address.BusinessAddressInfoData;
import com.twitter.business.model.phone.BusinessPhoneInfoData;
import java.util.List;
import com.twitter.business.model.hours.OpenHoursInterval;
import com.twitter.business.model.hours.DayAndOpenHours;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import com.twitter.business.model.AboutModuleDomainData;

// 
// Decompiled by Procyon v0.6.0
// 

public final class x7
{
    public final u33 a(final AboutModuleDomainData aboutModuleDomainData) {
        zzd.f((Object)aboutModuleDomainData, "input");
        final String currentWebsite = aboutModuleDomainData.getCurrentWebsite();
        final omj omj = null;
        v33 v33 = null;
        Label_0043: {
            if (currentWebsite != null) {
                final String h = w88.h(currentWebsite);
                if (h != null) {
                    v33 = new v33(h, h);
                    break Label_0043;
                }
            }
            v33 = null;
        }
        final BusinessPhoneInfoData phoneData = aboutModuleDomainData.getPhoneData();
        final String currentEmail = aboutModuleDomainData.getCurrentEmail();
        yu2 yu2;
        if (q0b.k(phoneData) && phoneData != null) {
            yu2 = new yu2(yk.y("+", phoneData.getCountryCode()), phoneData.getRawPhoneNumber(), phoneData.getCountryIso());
        }
        else {
            yu2 = null;
        }
        vu2 vu2;
        if (currentEmail != null && currentEmail.length() != 0) {
            vu2 = new vu2(currentEmail);
        }
        else {
            vu2 = null;
        }
        wu2 wu2;
        if (yu2 == null && vu2 == null) {
            wu2 = null;
        }
        else {
            wu2 = new wu2(yu2, vu2);
        }
        final BusinessAddressInfoData addressData = aboutModuleDomainData.getAddressData();
        rt2 rt2;
        if (addressData != null) {
            rt2 = new rt2(w88.h(addressData.getAddress()), w88.h(addressData.getAdminArea()), w88.h(addressData.getZipCode()), w88.h(addressData.getCity()), addressData.getCountryIso());
        }
        else {
            rt2 = null;
        }
        final BusinessHoursData hoursData = aboutModuleDomainData.getHoursData();
        t33 t33 = null;
        if (hoursData != null) {
            Label_0291: {
                if (hoursData.getHoursType() == iw2.E0) {
                    final String id = hoursData.getTimezone().getID();
                    if (id != null) {
                        t33 = new t33(id);
                        break Label_0291;
                    }
                }
                t33 = null;
            }
        }
        else {
            t33 = null;
        }
        final BusinessHoursData hoursData2 = aboutModuleDomainData.getHoursData();
        d23 d23;
        if (hoursData2 != null && hoursData2.getHoursType() != iw2.C0) {
            final int ordinal = ((Enum)hoursData2.getHoursType()).ordinal();
            omj omj2 = omj;
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    omj2 = omj.D0;
                }
                else {
                    omj2 = omj.C0;
                }
            }
            final List dailyBusinessHours = hoursData2.getDailyBusinessHours();
            final ArrayList list = new ArrayList<f23>(kr4.h1((Iterable)dailyBusinessHours, 10));
            for (final DayAndOpenHours dayAndOpenHours : dailyBusinessHours) {
                final Weekday day = dayAndOpenHours.getDay();
                final List intervals = dayAndOpenHours.getIntervals();
                final ArrayList list2 = new ArrayList<h23>(kr4.h1((Iterable)intervals, 10));
                for (final OpenHoursInterval openHoursInterval : intervals) {
                    list2.add(new h23(openHoursInterval.getStart(), openHoursInterval.getEnd()));
                }
                list.add(new f23(day, (List)list2));
            }
            d23 = new d23(omj2, (List<f23>)list);
        }
        else {
            d23 = null;
        }
        return new u33(v33, rt2, wu2, t33, d23);
    }
}
