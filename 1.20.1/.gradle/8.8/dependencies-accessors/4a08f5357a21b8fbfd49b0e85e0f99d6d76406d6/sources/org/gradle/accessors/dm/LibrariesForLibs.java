package org.gradle.accessors.dm;

import org.gradle.api.NonNullApi;
import org.gradle.api.artifacts.MinimalExternalModuleDependency;
import org.gradle.plugin.use.PluginDependency;
import org.gradle.api.artifacts.ExternalModuleDependencyBundle;
import org.gradle.api.artifacts.MutableVersionConstraint;
import org.gradle.api.provider.Provider;
import org.gradle.api.model.ObjectFactory;
import org.gradle.api.provider.ProviderFactory;
import org.gradle.api.internal.catalog.AbstractExternalDependencyFactory;
import org.gradle.api.internal.catalog.DefaultVersionCatalog;
import java.util.Map;
import org.gradle.api.internal.attributes.ImmutableAttributesFactory;
import org.gradle.api.internal.artifacts.dsl.CapabilityNotationParser;
import javax.inject.Inject;

/**
 * A catalog of dependencies accessible via the {@code libs} extension.
 */
@NonNullApi
public class LibrariesForLibs extends AbstractExternalDependencyFactory {

    private final AbstractExternalDependencyFactory owner = this;
    private final AppleskinLibraryAccessors laccForAppleskinLibraryAccessors = new AppleskinLibraryAccessors(owner);
    private final ArchitecturyLibraryAccessors laccForArchitecturyLibraryAccessors = new ArchitecturyLibraryAccessors(owner);
    private final BettermodsbuttonLibraryAccessors laccForBettermodsbuttonLibraryAccessors = new BettermodsbuttonLibraryAccessors(owner);
    private final CardinalcomponentsbaseLibraryAccessors laccForCardinalcomponentsbaseLibraryAccessors = new CardinalcomponentsbaseLibraryAccessors(owner);
    private final CardinalcomponentsblockLibraryAccessors laccForCardinalcomponentsblockLibraryAccessors = new CardinalcomponentsblockLibraryAccessors(owner);
    private final CardinalcomponentschunkLibraryAccessors laccForCardinalcomponentschunkLibraryAccessors = new CardinalcomponentschunkLibraryAccessors(owner);
    private final CardinalcomponentsentityLibraryAccessors laccForCardinalcomponentsentityLibraryAccessors = new CardinalcomponentsentityLibraryAccessors(owner);
    private final CardinalcomponentsworldLibraryAccessors laccForCardinalcomponentsworldLibraryAccessors = new CardinalcomponentsworldLibraryAccessors(owner);
    private final ClothLibraryAccessors laccForClothLibraryAccessors = new ClothLibraryAccessors(owner);
    private final CuriosLibraryAccessors laccForCuriosLibraryAccessors = new CuriosLibraryAccessors(owner);
    private final ExtensibleenumsLibraryAccessors laccForExtensibleenumsLibraryAccessors = new ExtensibleenumsLibraryAccessors(owner);
    private final FabricapiLibraryAccessors laccForFabricapiLibraryAccessors = new FabricapiLibraryAccessors(owner);
    private final FabricloaderLibraryAccessors laccForFabricloaderLibraryAccessors = new FabricloaderLibraryAccessors(owner);
    private final ForgeconfigapiportLibraryAccessors laccForForgeconfigapiportLibraryAccessors = new ForgeconfigapiportLibraryAccessors(owner);
    private final ForgeconfigscreensLibraryAccessors laccForForgeconfigscreensLibraryAccessors = new ForgeconfigscreensLibraryAccessors(owner);
    private final JeiLibraryAccessors laccForJeiLibraryAccessors = new JeiLibraryAccessors(owner);
    private final JeiapiLibraryAccessors laccForJeiapiLibraryAccessors = new JeiapiLibraryAccessors(owner);
    private final JeilibsLibraryAccessors laccForJeilibsLibraryAccessors = new JeilibsLibraryAccessors(owner);
    private final ModmenuLibraryAccessors laccForModmenuLibraryAccessors = new ModmenuLibraryAccessors(owner);
    private final PlaceboLibraryAccessors laccForPlaceboLibraryAccessors = new PlaceboLibraryAccessors(owner);
    private final PlayerabilitylibLibraryAccessors laccForPlayerabilitylibLibraryAccessors = new PlayerabilitylibLibraryAccessors(owner);
    private final PuzzlesaccessapiLibraryAccessors laccForPuzzlesaccessapiLibraryAccessors = new PuzzlesaccessapiLibraryAccessors(owner);
    private final PuzzlesapiLibraryAccessors laccForPuzzlesapiLibraryAccessors = new PuzzlesapiLibraryAccessors(owner);
    private final PuzzleslibLibraryAccessors laccForPuzzleslibLibraryAccessors = new PuzzleslibLibraryAccessors(owner);
    private final ReachentityattributesLibraryAccessors laccForReachentityattributesLibraryAccessors = new ReachentityattributesLibraryAccessors(owner);
    private final ReiLibraryAccessors laccForReiLibraryAccessors = new ReiLibraryAccessors(owner);
    private final ReiapiLibraryAccessors laccForReiapiLibraryAccessors = new ReiapiLibraryAccessors(owner);
    private final ReidefaultpluginLibraryAccessors laccForReidefaultpluginLibraryAccessors = new ReidefaultpluginLibraryAccessors(owner);
    private final TrinketsLibraryAccessors laccForTrinketsLibraryAccessors = new TrinketsLibraryAccessors(owner);
    private final VersionAccessors vaccForVersionAccessors = new VersionAccessors(providers, config);
    private final BundleAccessors baccForBundleAccessors = new BundleAccessors(objects, providers, config, attributesFactory, capabilityNotationParser);
    private final PluginAccessors paccForPluginAccessors = new PluginAccessors(providers, config);

    @Inject
    public LibrariesForLibs(DefaultVersionCatalog config, ProviderFactory providers, ObjectFactory objects, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) {
        super(config, providers, objects, attributesFactory, capabilityNotationParser);
    }

    /**
     * Dependency provider for <b>nightconfigcore</b> with <b>com.electronwill.night-config:core</b> coordinates and
     * with version reference <b>nightconfig</b>
     * <p>
     * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.20.1-v16
     */
    public Provider<MinimalExternalModuleDependency> getNightconfigcore() {
        return create("nightconfigcore");
    }

    /**
     * Dependency provider for <b>nightconfigtoml</b> with <b>com.electronwill.night-config:toml</b> coordinates and
     * with version reference <b>nightconfig</b>
     * <p>
     * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.20.1-v16
     */
    public Provider<MinimalExternalModuleDependency> getNightconfigtoml() {
        return create("nightconfigtoml");
    }

    /**
     * Group of libraries at <b>appleskin</b>
     */
    public AppleskinLibraryAccessors getAppleskin() {
        return laccForAppleskinLibraryAccessors;
    }

    /**
     * Group of libraries at <b>architectury</b>
     */
    public ArchitecturyLibraryAccessors getArchitectury() {
        return laccForArchitecturyLibraryAccessors;
    }

    /**
     * Group of libraries at <b>bettermodsbutton</b>
     */
    public BettermodsbuttonLibraryAccessors getBettermodsbutton() {
        return laccForBettermodsbuttonLibraryAccessors;
    }

    /**
     * Group of libraries at <b>cardinalcomponentsbase</b>
     */
    public CardinalcomponentsbaseLibraryAccessors getCardinalcomponentsbase() {
        return laccForCardinalcomponentsbaseLibraryAccessors;
    }

    /**
     * Group of libraries at <b>cardinalcomponentsblock</b>
     */
    public CardinalcomponentsblockLibraryAccessors getCardinalcomponentsblock() {
        return laccForCardinalcomponentsblockLibraryAccessors;
    }

    /**
     * Group of libraries at <b>cardinalcomponentschunk</b>
     */
    public CardinalcomponentschunkLibraryAccessors getCardinalcomponentschunk() {
        return laccForCardinalcomponentschunkLibraryAccessors;
    }

    /**
     * Group of libraries at <b>cardinalcomponentsentity</b>
     */
    public CardinalcomponentsentityLibraryAccessors getCardinalcomponentsentity() {
        return laccForCardinalcomponentsentityLibraryAccessors;
    }

    /**
     * Group of libraries at <b>cardinalcomponentsworld</b>
     */
    public CardinalcomponentsworldLibraryAccessors getCardinalcomponentsworld() {
        return laccForCardinalcomponentsworldLibraryAccessors;
    }

    /**
     * Group of libraries at <b>cloth</b>
     */
    public ClothLibraryAccessors getCloth() {
        return laccForClothLibraryAccessors;
    }

    /**
     * Group of libraries at <b>curios</b>
     */
    public CuriosLibraryAccessors getCurios() {
        return laccForCuriosLibraryAccessors;
    }

    /**
     * Group of libraries at <b>extensibleenums</b>
     */
    public ExtensibleenumsLibraryAccessors getExtensibleenums() {
        return laccForExtensibleenumsLibraryAccessors;
    }

    /**
     * Group of libraries at <b>fabricapi</b>
     */
    public FabricapiLibraryAccessors getFabricapi() {
        return laccForFabricapiLibraryAccessors;
    }

    /**
     * Group of libraries at <b>fabricloader</b>
     */
    public FabricloaderLibraryAccessors getFabricloader() {
        return laccForFabricloaderLibraryAccessors;
    }

    /**
     * Group of libraries at <b>forgeconfigapiport</b>
     */
    public ForgeconfigapiportLibraryAccessors getForgeconfigapiport() {
        return laccForForgeconfigapiportLibraryAccessors;
    }

    /**
     * Group of libraries at <b>forgeconfigscreens</b>
     */
    public ForgeconfigscreensLibraryAccessors getForgeconfigscreens() {
        return laccForForgeconfigscreensLibraryAccessors;
    }

    /**
     * Group of libraries at <b>jei</b>
     */
    public JeiLibraryAccessors getJei() {
        return laccForJeiLibraryAccessors;
    }

    /**
     * Group of libraries at <b>jeiapi</b>
     */
    public JeiapiLibraryAccessors getJeiapi() {
        return laccForJeiapiLibraryAccessors;
    }

    /**
     * Group of libraries at <b>jeilibs</b>
     */
    public JeilibsLibraryAccessors getJeilibs() {
        return laccForJeilibsLibraryAccessors;
    }

    /**
     * Group of libraries at <b>modmenu</b>
     */
    public ModmenuLibraryAccessors getModmenu() {
        return laccForModmenuLibraryAccessors;
    }

    /**
     * Group of libraries at <b>placebo</b>
     */
    public PlaceboLibraryAccessors getPlacebo() {
        return laccForPlaceboLibraryAccessors;
    }

    /**
     * Group of libraries at <b>playerabilitylib</b>
     */
    public PlayerabilitylibLibraryAccessors getPlayerabilitylib() {
        return laccForPlayerabilitylibLibraryAccessors;
    }

    /**
     * Group of libraries at <b>puzzlesaccessapi</b>
     */
    public PuzzlesaccessapiLibraryAccessors getPuzzlesaccessapi() {
        return laccForPuzzlesaccessapiLibraryAccessors;
    }

    /**
     * Group of libraries at <b>puzzlesapi</b>
     */
    public PuzzlesapiLibraryAccessors getPuzzlesapi() {
        return laccForPuzzlesapiLibraryAccessors;
    }

    /**
     * Group of libraries at <b>puzzleslib</b>
     */
    public PuzzleslibLibraryAccessors getPuzzleslib() {
        return laccForPuzzleslibLibraryAccessors;
    }

    /**
     * Group of libraries at <b>reachentityattributes</b>
     */
    public ReachentityattributesLibraryAccessors getReachentityattributes() {
        return laccForReachentityattributesLibraryAccessors;
    }

    /**
     * Group of libraries at <b>rei</b>
     */
    public ReiLibraryAccessors getRei() {
        return laccForReiLibraryAccessors;
    }

    /**
     * Group of libraries at <b>reiapi</b>
     */
    public ReiapiLibraryAccessors getReiapi() {
        return laccForReiapiLibraryAccessors;
    }

    /**
     * Group of libraries at <b>reidefaultplugin</b>
     */
    public ReidefaultpluginLibraryAccessors getReidefaultplugin() {
        return laccForReidefaultpluginLibraryAccessors;
    }

    /**
     * Group of libraries at <b>trinkets</b>
     */
    public TrinketsLibraryAccessors getTrinkets() {
        return laccForTrinketsLibraryAccessors;
    }

    /**
     * Group of versions at <b>versions</b>
     */
    public VersionAccessors getVersions() {
        return vaccForVersionAccessors;
    }

    /**
     * Group of bundles at <b>bundles</b>
     */
    public BundleAccessors getBundles() {
        return baccForBundleAccessors;
    }

    /**
     * Group of plugins at <b>plugins</b>
     */
    public PluginAccessors getPlugins() {
        return paccForPluginAccessors;
    }

    public static class AppleskinLibraryAccessors extends SubDependencyFactory {

        public AppleskinLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>fabric</b> with <b>squeek.appleskin:appleskin-fabric</b> coordinates and
         * with version reference <b>appleskin.fabric</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.20.1-v16
         */
        public Provider<MinimalExternalModuleDependency> getFabric() {
            return create("appleskin.fabric");
        }

        /**
         * Dependency provider for <b>forge</b> with <b>squeek.appleskin:appleskin-forge</b> coordinates and
         * with version reference <b>appleskin.forge</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.20.1-v16
         */
        public Provider<MinimalExternalModuleDependency> getForge() {
            return create("appleskin.forge");
        }

    }

    public static class ArchitecturyLibraryAccessors extends SubDependencyFactory {

        public ArchitecturyLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>fabric</b> with <b>dev.architectury:architectury-fabric</b> coordinates and
         * with version reference <b>architectury</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.20.1-v16
         */
        public Provider<MinimalExternalModuleDependency> getFabric() {
            return create("architectury.fabric");
        }

        /**
         * Dependency provider for <b>forge</b> with <b>dev.architectury:architectury-forge</b> coordinates and
         * with version reference <b>architectury</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.20.1-v16
         */
        public Provider<MinimalExternalModuleDependency> getForge() {
            return create("architectury.forge");
        }

    }

    public static class BettermodsbuttonLibraryAccessors extends SubDependencyFactory {

        public BettermodsbuttonLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>forge</b> with <b>fuzs.bettermodsbutton:bettermodsbutton-forge</b> coordinates and
         * with version reference <b>bettermodsbutton</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.20.1-v16
         */
        public Provider<MinimalExternalModuleDependency> getForge() {
            return create("bettermodsbutton.forge");
        }

    }

    public static class CardinalcomponentsbaseLibraryAccessors extends SubDependencyFactory {

        public CardinalcomponentsbaseLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>fabric</b> with <b>dev.onyxstudios.cardinal-components-api:cardinal-components-base</b> coordinates and
         * with version reference <b>cardinalcomponents</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.20.1-v16
         */
        public Provider<MinimalExternalModuleDependency> getFabric() {
            return create("cardinalcomponentsbase.fabric");
        }

    }

    public static class CardinalcomponentsblockLibraryAccessors extends SubDependencyFactory {

        public CardinalcomponentsblockLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>fabric</b> with <b>dev.onyxstudios.cardinal-components-api:cardinal-components-block</b> coordinates and
         * with version reference <b>cardinalcomponents</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.20.1-v16
         */
        public Provider<MinimalExternalModuleDependency> getFabric() {
            return create("cardinalcomponentsblock.fabric");
        }

    }

    public static class CardinalcomponentschunkLibraryAccessors extends SubDependencyFactory {

        public CardinalcomponentschunkLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>fabric</b> with <b>dev.onyxstudios.cardinal-components-api:cardinal-components-chunk</b> coordinates and
         * with version reference <b>cardinalcomponents</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.20.1-v16
         */
        public Provider<MinimalExternalModuleDependency> getFabric() {
            return create("cardinalcomponentschunk.fabric");
        }

    }

    public static class CardinalcomponentsentityLibraryAccessors extends SubDependencyFactory {

        public CardinalcomponentsentityLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>fabric</b> with <b>dev.onyxstudios.cardinal-components-api:cardinal-components-entity</b> coordinates and
         * with version reference <b>cardinalcomponents</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.20.1-v16
         */
        public Provider<MinimalExternalModuleDependency> getFabric() {
            return create("cardinalcomponentsentity.fabric");
        }

    }

    public static class CardinalcomponentsworldLibraryAccessors extends SubDependencyFactory {

        public CardinalcomponentsworldLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>fabric</b> with <b>dev.onyxstudios.cardinal-components-api:cardinal-components-world</b> coordinates and
         * with version reference <b>cardinalcomponents</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.20.1-v16
         */
        public Provider<MinimalExternalModuleDependency> getFabric() {
            return create("cardinalcomponentsworld.fabric");
        }

    }

    public static class ClothLibraryAccessors extends SubDependencyFactory {

        public ClothLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>fabric</b> with <b>me.shedaniel.cloth:cloth-config-fabric</b> coordinates and
         * with version reference <b>cloth</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.20.1-v16
         */
        public Provider<MinimalExternalModuleDependency> getFabric() {
            return create("cloth.fabric");
        }

        /**
         * Dependency provider for <b>forge</b> with <b>me.shedaniel.cloth:cloth-config-forge</b> coordinates and
         * with version reference <b>cloth</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.20.1-v16
         */
        public Provider<MinimalExternalModuleDependency> getForge() {
            return create("cloth.forge");
        }

    }

    public static class CuriosLibraryAccessors extends SubDependencyFactory {

        public CuriosLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>forge</b> with <b>top.theillusivec4.curios:curios-forge</b> coordinates and
         * with version reference <b>curios</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.20.1-v16
         */
        public Provider<MinimalExternalModuleDependency> getForge() {
            return create("curios.forge");
        }

    }

    public static class ExtensibleenumsLibraryAccessors extends SubDependencyFactory {

        public ExtensibleenumsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>fabric</b> with <b>fuzs.extensibleenums:extensibleenums-fabric</b> coordinates and
         * with version reference <b>extensibleenums</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.20.1-v16
         */
        public Provider<MinimalExternalModuleDependency> getFabric() {
            return create("extensibleenums.fabric");
        }

    }

    public static class FabricapiLibraryAccessors extends SubDependencyFactory {

        public FabricapiLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>fabric</b> with <b>net.fabricmc.fabric-api:fabric-api</b> coordinates and
         * with version reference <b>fabricapi.version</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.20.1-v16
         */
        public Provider<MinimalExternalModuleDependency> getFabric() {
            return create("fabricapi.fabric");
        }

    }

    public static class FabricloaderLibraryAccessors extends SubDependencyFactory {

        public FabricloaderLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>fabric</b> with <b>net.fabricmc:fabric-loader</b> coordinates and
         * with version reference <b>fabricloader.version</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.20.1-v16
         */
        public Provider<MinimalExternalModuleDependency> getFabric() {
            return create("fabricloader.fabric");
        }

    }

    public static class ForgeconfigapiportLibraryAccessors extends SubDependencyFactory {

        public ForgeconfigapiportLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>common</b> with <b>fuzs.forgeconfigapiport:forgeconfigapiport-common</b> coordinates and
         * with version reference <b>forgeconfigapiport</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.20.1-v16
         */
        public Provider<MinimalExternalModuleDependency> getCommon() {
            return create("forgeconfigapiport.common");
        }

        /**
         * Dependency provider for <b>fabric</b> with <b>fuzs.forgeconfigapiport:forgeconfigapiport-fabric</b> coordinates and
         * with version reference <b>forgeconfigapiport</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.20.1-v16
         */
        public Provider<MinimalExternalModuleDependency> getFabric() {
            return create("forgeconfigapiport.fabric");
        }

    }

    public static class ForgeconfigscreensLibraryAccessors extends SubDependencyFactory {

        public ForgeconfigscreensLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>fabric</b> with <b>fuzs.forgeconfigscreens:forgeconfigscreens-fabric</b> coordinates and
         * with version reference <b>forgeconfigscreens</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.20.1-v16
         */
        public Provider<MinimalExternalModuleDependency> getFabric() {
            return create("forgeconfigscreens.fabric");
        }

        /**
         * Dependency provider for <b>forge</b> with <b>fuzs.forgeconfigscreens:forgeconfigscreens-forge</b> coordinates and
         * with version reference <b>forgeconfigscreens</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.20.1-v16
         */
        public Provider<MinimalExternalModuleDependency> getForge() {
            return create("forgeconfigscreens.forge");
        }

    }

    public static class JeiLibraryAccessors extends SubDependencyFactory {

        public JeiLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>fabric</b> with <b>mezz.jei:jei-1.20.1-fabric</b> coordinates and
         * with version reference <b>jei</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.20.1-v16
         */
        public Provider<MinimalExternalModuleDependency> getFabric() {
            return create("jei.fabric");
        }

        /**
         * Dependency provider for <b>forge</b> with <b>mezz.jei:jei-1.20.1-forge</b> coordinates and
         * with version reference <b>jei</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.20.1-v16
         */
        public Provider<MinimalExternalModuleDependency> getForge() {
            return create("jei.forge");
        }

    }

    public static class JeiapiLibraryAccessors extends SubDependencyFactory {

        public JeiapiLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>common</b> with <b>mezz.jei:jei-1.20.1-common-api</b> coordinates and
         * with version reference <b>jei</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.20.1-v16
         */
        public Provider<MinimalExternalModuleDependency> getCommon() {
            return create("jeiapi.common");
        }

        /**
         * Dependency provider for <b>fabric</b> with <b>mezz.jei:jei-1.20.1-fabric-api</b> coordinates and
         * with version reference <b>jei</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.20.1-v16
         */
        public Provider<MinimalExternalModuleDependency> getFabric() {
            return create("jeiapi.fabric");
        }

        /**
         * Dependency provider for <b>forge</b> with <b>mezz.jei:jei-1.20.1-forge-api</b> coordinates and
         * with version reference <b>jei</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.20.1-v16
         */
        public Provider<MinimalExternalModuleDependency> getForge() {
            return create("jeiapi.forge");
        }

    }

    public static class JeilibsLibraryAccessors extends SubDependencyFactory {

        public JeilibsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>common</b> with <b>mezz.jei:jei-1.20.1-lib</b> coordinates and
         * with version reference <b>jei</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.20.1-v16
         */
        public Provider<MinimalExternalModuleDependency> getCommon() {
            return create("jeilibs.common");
        }

    }

    public static class ModmenuLibraryAccessors extends SubDependencyFactory {

        public ModmenuLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>fabric</b> with <b>com.terraformersmc:modmenu</b> coordinates and
         * with version reference <b>modmenu</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.20.1-v16
         */
        public Provider<MinimalExternalModuleDependency> getFabric() {
            return create("modmenu.fabric");
        }

    }

    public static class PlaceboLibraryAccessors extends SubDependencyFactory {

        public PlaceboLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>forge</b> with <b>curse.maven:placebo-283644</b> coordinates and
         * with version reference <b>placebo</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.20.1-v16
         */
        public Provider<MinimalExternalModuleDependency> getForge() {
            return create("placebo.forge");
        }

    }

    public static class PlayerabilitylibLibraryAccessors extends SubDependencyFactory {

        public PlayerabilitylibLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>fabric</b> with <b>io.github.ladysnake:PlayerAbilityLib</b> coordinates and
         * with version reference <b>playerabilitylib</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.20.1-v16
         */
        public Provider<MinimalExternalModuleDependency> getFabric() {
            return create("playerabilitylib.fabric");
        }

    }

    public static class PuzzlesaccessapiLibraryAccessors extends SubDependencyFactory {

        public PuzzlesaccessapiLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>common</b> with <b>fuzs.puzzlesaccessapi:puzzlesaccessapi-common</b> coordinates and
         * with version reference <b>puzzlesaccessapi</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.20.1-v16
         */
        public Provider<MinimalExternalModuleDependency> getCommon() {
            return create("puzzlesaccessapi.common");
        }

        /**
         * Dependency provider for <b>fabric</b> with <b>fuzs.puzzlesaccessapi:puzzlesaccessapi-fabric</b> coordinates and
         * with version reference <b>puzzlesaccessapi</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.20.1-v16
         */
        public Provider<MinimalExternalModuleDependency> getFabric() {
            return create("puzzlesaccessapi.fabric");
        }

        /**
         * Dependency provider for <b>forge</b> with <b>fuzs.puzzlesaccessapi:puzzlesaccessapi-forge</b> coordinates and
         * with version reference <b>puzzlesaccessapi</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.20.1-v16
         */
        public Provider<MinimalExternalModuleDependency> getForge() {
            return create("puzzlesaccessapi.forge");
        }

    }

    public static class PuzzlesapiLibraryAccessors extends SubDependencyFactory {

        public PuzzlesapiLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>common</b> with <b>fuzs.puzzlesapi:puzzlesapi-common</b> coordinates and
         * with version reference <b>puzzlesapi</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.20.1-v16
         */
        public Provider<MinimalExternalModuleDependency> getCommon() {
            return create("puzzlesapi.common");
        }

        /**
         * Dependency provider for <b>fabric</b> with <b>fuzs.puzzlesapi:puzzlesapi-fabric</b> coordinates and
         * with version reference <b>puzzlesapi</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.20.1-v16
         */
        public Provider<MinimalExternalModuleDependency> getFabric() {
            return create("puzzlesapi.fabric");
        }

        /**
         * Dependency provider for <b>forge</b> with <b>fuzs.puzzlesapi:puzzlesapi-forge</b> coordinates and
         * with version reference <b>puzzlesapi</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.20.1-v16
         */
        public Provider<MinimalExternalModuleDependency> getForge() {
            return create("puzzlesapi.forge");
        }

    }

    public static class PuzzleslibLibraryAccessors extends SubDependencyFactory {

        public PuzzleslibLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>common</b> with <b>fuzs.puzzleslib:puzzleslib-common</b> coordinates and
         * with version reference <b>puzzleslib.version</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.20.1-v16
         */
        public Provider<MinimalExternalModuleDependency> getCommon() {
            return create("puzzleslib.common");
        }

        /**
         * Dependency provider for <b>fabric</b> with <b>fuzs.puzzleslib:puzzleslib-fabric</b> coordinates and
         * with version reference <b>puzzleslib.version</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.20.1-v16
         */
        public Provider<MinimalExternalModuleDependency> getFabric() {
            return create("puzzleslib.fabric");
        }

        /**
         * Dependency provider for <b>forge</b> with <b>fuzs.puzzleslib:puzzleslib-forge</b> coordinates and
         * with version reference <b>puzzleslib.version</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.20.1-v16
         */
        public Provider<MinimalExternalModuleDependency> getForge() {
            return create("puzzleslib.forge");
        }

    }

    public static class ReachentityattributesLibraryAccessors extends SubDependencyFactory {

        public ReachentityattributesLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>fabric</b> with <b>com.jamieswhiteshirt:reach-entity-attributes</b> coordinates and
         * with version reference <b>reachentityattributes</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.20.1-v16
         */
        public Provider<MinimalExternalModuleDependency> getFabric() {
            return create("reachentityattributes.fabric");
        }

    }

    public static class ReiLibraryAccessors extends SubDependencyFactory {

        public ReiLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>fabric</b> with <b>me.shedaniel:RoughlyEnoughItems-fabric</b> coordinates and
         * with version reference <b>rei</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.20.1-v16
         */
        public Provider<MinimalExternalModuleDependency> getFabric() {
            return create("rei.fabric");
        }

        /**
         * Dependency provider for <b>forge</b> with <b>me.shedaniel:RoughlyEnoughItems-forge</b> coordinates and
         * with version reference <b>rei</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.20.1-v16
         */
        public Provider<MinimalExternalModuleDependency> getForge() {
            return create("rei.forge");
        }

    }

    public static class ReiapiLibraryAccessors extends SubDependencyFactory {

        public ReiapiLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>common</b> with <b>me.shedaniel:RoughlyEnoughItems-api</b> coordinates and
         * with version reference <b>rei</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.20.1-v16
         */
        public Provider<MinimalExternalModuleDependency> getCommon() {
            return create("reiapi.common");
        }

        /**
         * Dependency provider for <b>fabric</b> with <b>me.shedaniel:RoughlyEnoughItems-api-fabric</b> coordinates and
         * with version reference <b>rei</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.20.1-v16
         */
        public Provider<MinimalExternalModuleDependency> getFabric() {
            return create("reiapi.fabric");
        }

    }

    public static class ReidefaultpluginLibraryAccessors extends SubDependencyFactory {

        public ReidefaultpluginLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>common</b> with <b>me.shedaniel:RoughlyEnoughItems-default-plugin</b> coordinates and
         * with version reference <b>rei</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.20.1-v16
         */
        public Provider<MinimalExternalModuleDependency> getCommon() {
            return create("reidefaultplugin.common");
        }

        /**
         * Dependency provider for <b>fabric</b> with <b>me.shedaniel:RoughlyEnoughItems-default-plugin-fabric</b> coordinates and
         * with version reference <b>rei</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.20.1-v16
         */
        public Provider<MinimalExternalModuleDependency> getFabric() {
            return create("reidefaultplugin.fabric");
        }

    }

    public static class TrinketsLibraryAccessors extends SubDependencyFactory {

        public TrinketsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>fabric</b> with <b>dev.emi:trinkets</b> coordinates and
         * with version reference <b>trinkets</b>
         * <p>
         * This dependency was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.20.1-v16
         */
        public Provider<MinimalExternalModuleDependency> getFabric() {
            return create("trinkets.fabric");
        }

    }

    public static class VersionAccessors extends VersionFactory  {

        private final AppleskinVersionAccessors vaccForAppleskinVersionAccessors = new AppleskinVersionAccessors(providers, config);
        private final FabricapiVersionAccessors vaccForFabricapiVersionAccessors = new FabricapiVersionAccessors(providers, config);
        private final FabricloaderVersionAccessors vaccForFabricloaderVersionAccessors = new FabricloaderVersionAccessors(providers, config);
        private final ForgeVersionAccessors vaccForForgeVersionAccessors = new ForgeVersionAccessors(providers, config);
        private final ParchmentVersionAccessors vaccForParchmentVersionAccessors = new ParchmentVersionAccessors(providers, config);
        private final PuzzleslibVersionAccessors vaccForPuzzleslibVersionAccessors = new PuzzleslibVersionAccessors(providers, config);
        private final QslVersionAccessors vaccForQslVersionAccessors = new QslVersionAccessors(providers, config);
        private final QuiltloaderVersionAccessors vaccForQuiltloaderVersionAccessors = new QuiltloaderVersionAccessors(providers, config);
        public VersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>architectury</b> with value <b>9.0.8</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.20.1-v16
         */
        public Provider<String> getArchitectury() { return getVersion("architectury"); }

        /**
         * Version alias <b>bettermodsbutton</b> with value <b>8.0.2</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.20.1-v16
         */
        public Provider<String> getBettermodsbutton() { return getVersion("bettermodsbutton"); }

        /**
         * Version alias <b>cardinalcomponents</b> with value <b>5.2.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.20.1-v16
         */
        public Provider<String> getCardinalcomponents() { return getVersion("cardinalcomponents"); }

        /**
         * Version alias <b>cloth</b> with value <b>11.0.99</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.20.1-v16
         */
        public Provider<String> getCloth() { return getVersion("cloth"); }

        /**
         * Version alias <b>curios</b> with value <b>5.2.0-beta.3+1.20.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.20.1-v16
         */
        public Provider<String> getCurios() { return getVersion("curios"); }

        /**
         * Version alias <b>data</b> with value <b>15</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.20.1-v16
         */
        public Provider<String> getData() { return getVersion("data"); }

        /**
         * Version alias <b>extensibleenums</b> with value <b>7.0.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.20.1-v16
         */
        public Provider<String> getExtensibleenums() { return getVersion("extensibleenums"); }

        /**
         * Version alias <b>forgeconfigapiport</b> with value <b>8.0.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.20.1-v16
         */
        public Provider<String> getForgeconfigapiport() { return getVersion("forgeconfigapiport"); }

        /**
         * Version alias <b>forgeconfigscreens</b> with value <b>8.0.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.20.1-v16
         */
        public Provider<String> getForgeconfigscreens() { return getVersion("forgeconfigscreens"); }

        /**
         * Version alias <b>jei</b> with value <b>15.1.0.19</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.20.1-v16
         */
        public Provider<String> getJei() { return getVersion("jei"); }

        /**
         * Version alias <b>minecraft</b> with value <b>1.20.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.20.1-v16
         */
        public Provider<String> getMinecraft() { return getVersion("minecraft"); }

        /**
         * Version alias <b>modmenu</b> with value <b>7.1.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.20.1-v16
         */
        public Provider<String> getModmenu() { return getVersion("modmenu"); }

        /**
         * Version alias <b>nightconfig</b> with value <b>3.6.6</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.20.1-v16
         */
        public Provider<String> getNightconfig() { return getVersion("nightconfig"); }

        /**
         * Version alias <b>placebo</b> with value <b>4696218</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.20.1-v16
         */
        public Provider<String> getPlacebo() { return getVersion("placebo"); }

        /**
         * Version alias <b>playerabilitylib</b> with value <b>1.8.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.20.1-v16
         */
        public Provider<String> getPlayerabilitylib() { return getVersion("playerabilitylib"); }

        /**
         * Version alias <b>puzzlesaccessapi</b> with value <b>8.0.5</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.20.1-v16
         */
        public Provider<String> getPuzzlesaccessapi() { return getVersion("puzzlesaccessapi"); }

        /**
         * Version alias <b>puzzlesapi</b> with value <b>8.1.2</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.20.1-v16
         */
        public Provider<String> getPuzzlesapi() { return getVersion("puzzlesapi"); }

        /**
         * Version alias <b>reachentityattributes</b> with value <b>2.4.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.20.1-v16
         */
        public Provider<String> getReachentityattributes() { return getVersion("reachentityattributes"); }

        /**
         * Version alias <b>rei</b> with value <b>12.0.625</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.20.1-v16
         */
        public Provider<String> getRei() { return getVersion("rei"); }

        /**
         * Version alias <b>resources</b> with value <b>15</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.20.1-v16
         */
        public Provider<String> getResources() { return getVersion("resources"); }

        /**
         * Version alias <b>trinkets</b> with value <b>3.7.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.20.1-v16
         */
        public Provider<String> getTrinkets() { return getVersion("trinkets"); }

        /**
         * Group of versions at <b>versions.appleskin</b>
         */
        public AppleskinVersionAccessors getAppleskin() {
            return vaccForAppleskinVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.fabricapi</b>
         */
        public FabricapiVersionAccessors getFabricapi() {
            return vaccForFabricapiVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.fabricloader</b>
         */
        public FabricloaderVersionAccessors getFabricloader() {
            return vaccForFabricloaderVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.forge</b>
         */
        public ForgeVersionAccessors getForge() {
            return vaccForForgeVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.parchment</b>
         */
        public ParchmentVersionAccessors getParchment() {
            return vaccForParchmentVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.puzzleslib</b>
         */
        public PuzzleslibVersionAccessors getPuzzleslib() {
            return vaccForPuzzleslibVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.qsl</b>
         */
        public QslVersionAccessors getQsl() {
            return vaccForQslVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.quiltloader</b>
         */
        public QuiltloaderVersionAccessors getQuiltloader() {
            return vaccForQuiltloaderVersionAccessors;
        }

    }

    public static class AppleskinVersionAccessors extends VersionFactory  {

        public AppleskinVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>appleskin.fabric</b> with value <b>mc1.20-2.5.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.20.1-v16
         */
        public Provider<String> getFabric() { return getVersion("appleskin.fabric"); }

        /**
         * Version alias <b>appleskin.forge</b> with value <b>mc1.20.1-2.5.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.20.1-v16
         */
        public Provider<String> getForge() { return getVersion("appleskin.forge"); }

    }

    public static class FabricapiVersionAccessors extends VersionFactory  {

        public FabricapiVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>fabricapi.min</b> with value <b>0.86.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.20.1-v16
         */
        public Provider<String> getMin() { return getVersion("fabricapi.min"); }

        /**
         * Version alias <b>fabricapi.version</b> with value <b>0.87.0+1.20.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.20.1-v16
         */
        public Provider<String> getVersion() { return getVersion("fabricapi.version"); }

    }

    public static class FabricloaderVersionAccessors extends VersionFactory  {

        public FabricloaderVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>fabricloader.min</b> with value <b>0.14.21</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.20.1-v16
         */
        public Provider<String> getMin() { return getVersion("fabricloader.min"); }

        /**
         * Version alias <b>fabricloader.version</b> with value <b>0.14.22</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.20.1-v16
         */
        public Provider<String> getVersion() { return getVersion("fabricloader.version"); }

    }

    public static class ForgeVersionAccessors extends VersionFactory  {

        public ForgeVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>forge.min</b> with value <b>47.1.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.20.1-v16
         */
        public Provider<String> getMin() { return getVersion("forge.min"); }

        /**
         * Version alias <b>forge.version</b> with value <b>1.20.1-47.1.43</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.20.1-v16
         */
        public Provider<String> getVersion() { return getVersion("forge.version"); }

    }

    public static class ParchmentVersionAccessors extends VersionFactory  {

        public ParchmentVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>parchment.minecraft</b> with value <b>1.20.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.20.1-v16
         */
        public Provider<String> getMinecraft() { return getVersion("parchment.minecraft"); }

        /**
         * Version alias <b>parchment.version</b> with value <b>2023.08.06</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.20.1-v16
         */
        public Provider<String> getVersion() { return getVersion("parchment.version"); }

    }

    public static class PuzzleslibVersionAccessors extends VersionFactory  {

        public PuzzleslibVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>puzzleslib.min</b> with value <b>8.0.21</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.20.1-v16
         */
        public Provider<String> getMin() { return getVersion("puzzleslib.min"); }

        /**
         * Version alias <b>puzzleslib.version</b> with value <b>8.0.21</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.20.1-v16
         */
        public Provider<String> getVersion() { return getVersion("puzzleslib.version"); }

    }

    public static class QslVersionAccessors extends VersionFactory  {

        public QslVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>qsl.min</b> with value <b>6.0.3</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.20.1-v16
         */
        public Provider<String> getMin() { return getVersion("qsl.min"); }

        /**
         * Version alias <b>qsl.version</b> with value <b>6.0.3+1.20.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.20.1-v16
         */
        public Provider<String> getVersion() { return getVersion("qsl.version"); }

    }

    public static class QuiltloaderVersionAccessors extends VersionFactory  {

        public QuiltloaderVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>quiltloader.min</b> with value <b>0.19.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.20.1-v16
         */
        public Provider<String> getMin() { return getVersion("quiltloader.min"); }

        /**
         * Version alias <b>quiltloader.version</b> with value <b>0.19.0-beta.18</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.20.1-v16
         */
        public Provider<String> getVersion() { return getVersion("quiltloader.version"); }

    }

    public static class BundleAccessors extends BundleFactory {

        public BundleAccessors(ObjectFactory objects, ProviderFactory providers, DefaultVersionCatalog config, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) { super(objects, providers, config, attributesFactory, capabilityNotationParser); }

    }

    public static class PluginAccessors extends PluginFactory {

        public PluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Plugin provider for <b>cursegradle</b> with plugin id <b>me.hypherionmc.cursegradle</b> and
         * with version <b>2.+</b>
         * <p>
         * This plugin was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.20.1-v16
         */
        public Provider<PluginDependency> getCursegradle() { return createPlugin("cursegradle"); }

        /**
         * Plugin provider for <b>forgegradle</b> with plugin id <b>net.minecraftforge.gradle</b> and
         * with version <b>6.+</b>
         * <p>
         * This plugin was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.20.1-v16
         */
        public Provider<PluginDependency> getForgegradle() { return createPlugin("forgegradle"); }

        /**
         * Plugin provider for <b>librarian</b> with plugin id <b>org.parchmentmc.librarian.forgegradle</b> and
         * with version <b>1.+</b>
         * <p>
         * This plugin was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.20.1-v16
         */
        public Provider<PluginDependency> getLibrarian() { return createPlugin("librarian"); }

        /**
         * Plugin provider for <b>loom</b> with plugin id <b>fabric-loom</b> and
         * with version <b>1.3.+</b>
         * <p>
         * This plugin was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.20.1-v16
         */
        public Provider<PluginDependency> getLoom() { return createPlugin("loom"); }

        /**
         * Plugin provider for <b>minotaur</b> with plugin id <b>com.modrinth.minotaur</b> and
         * with version <b>2.+</b>
         * <p>
         * This plugin was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.20.1-v16
         */
        public Provider<PluginDependency> getMinotaur() { return createPlugin("minotaur"); }

        /**
         * Plugin provider for <b>mixin</b> with plugin id <b>org.spongepowered.mixin</b> and
         * with version <b>0.7.+</b>
         * <p>
         * This plugin was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.20.1-v16
         */
        public Provider<PluginDependency> getMixin() { return createPlugin("mixin"); }

        /**
         * Plugin provider for <b>quiltflower</b> with plugin id <b>io.github.juuxel.loom-vineflower</b> and
         * with version <b>1.+</b>
         * <p>
         * This plugin was declared in catalog fuzs.sharedcatalogs:sharedcatalogs:1.20.1-v16
         */
        public Provider<PluginDependency> getQuiltflower() { return createPlugin("quiltflower"); }

    }

}
