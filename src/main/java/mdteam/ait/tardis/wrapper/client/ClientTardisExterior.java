package mdteam.ait.tardis.wrapper.client;

import mdteam.ait.client.renderers.exteriors.ExteriorEnum;
import mdteam.ait.client.renderers.exteriors.VariantEnum;
import mdteam.ait.tardis.Tardis;
import mdteam.ait.tardis.TardisExterior;

public class ClientTardisExterior extends TardisExterior {

    public ClientTardisExterior(Tardis tardis, ExteriorEnum exterior, VariantEnum variant) {
        super(tardis, exterior, variant);
    }
}
