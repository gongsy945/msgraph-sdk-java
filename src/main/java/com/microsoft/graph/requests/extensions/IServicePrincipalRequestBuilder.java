// Template Source: IBaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ServicePrincipal;
import com.microsoft.graph.models.extensions.KeyCredential;
import com.microsoft.graph.models.extensions.PasswordCredential;
import com.microsoft.graph.requests.extensions.IAppRoleAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAppRoleAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IClaimsMappingPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IClaimsMappingPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectRequestBuilder;
import com.microsoft.graph.requests.extensions.IDelegatedPermissionClassificationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDelegatedPermissionClassificationRequestBuilder;
import com.microsoft.graph.requests.extensions.IEndpointCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEndpointRequestBuilder;
import com.microsoft.graph.requests.extensions.IHomeRealmDiscoveryPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IHomeRealmDiscoveryPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.IOAuth2PermissionGrantCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOAuth2PermissionGrantRequestBuilder;
import com.microsoft.graph.requests.extensions.ITokenIssuancePolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITokenIssuancePolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.ITokenLifetimePolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITokenLifetimePolicyRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Service Principal Request Builder.
 */
public interface IServicePrincipalRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IServicePrincipalRequest instance
     */
    IServicePrincipalRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IServicePrincipalRequest instance
     */
    IServicePrincipalRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    IAppRoleAssignmentCollectionRequestBuilder appRoleAssignedTo();

    IAppRoleAssignmentRequestBuilder appRoleAssignedTo(final String id);

    IAppRoleAssignmentCollectionRequestBuilder appRoleAssignments();

    IAppRoleAssignmentRequestBuilder appRoleAssignments(final String id);

    IClaimsMappingPolicyCollectionWithReferencesRequestBuilder claimsMappingPolicies();

    IClaimsMappingPolicyWithReferenceRequestBuilder claimsMappingPolicies(final String id);

    IDirectoryObjectCollectionWithReferencesRequestBuilder createdObjects();

    IDirectoryObjectWithReferenceRequestBuilder createdObjects(final String id);

    IServicePrincipalCollectionWithReferencesRequestBuilder createdObjectsAsServicePrincipal();

    IServicePrincipalWithReferenceRequestBuilder createdObjectsAsServicePrincipal(final String id);

    IDelegatedPermissionClassificationCollectionRequestBuilder delegatedPermissionClassifications();

    IDelegatedPermissionClassificationRequestBuilder delegatedPermissionClassifications(final String id);

    IEndpointCollectionRequestBuilder endpoints();

    IEndpointRequestBuilder endpoints(final String id);

    IHomeRealmDiscoveryPolicyCollectionWithReferencesRequestBuilder homeRealmDiscoveryPolicies();

    IHomeRealmDiscoveryPolicyWithReferenceRequestBuilder homeRealmDiscoveryPolicies(final String id);

    IDirectoryObjectCollectionWithReferencesRequestBuilder memberOf();

    IDirectoryObjectWithReferenceRequestBuilder memberOf(final String id);

    IUserCollectionWithReferencesRequestBuilder memberOfAsUser();

    IUserWithReferenceRequestBuilder memberOfAsUser(final String id);

    IGroupCollectionWithReferencesRequestBuilder memberOfAsGroup();

    IGroupWithReferenceRequestBuilder memberOfAsGroup(final String id);

    IApplicationCollectionWithReferencesRequestBuilder memberOfAsApplication();

    IApplicationWithReferenceRequestBuilder memberOfAsApplication(final String id);

    IServicePrincipalCollectionWithReferencesRequestBuilder memberOfAsServicePrincipal();

    IServicePrincipalWithReferenceRequestBuilder memberOfAsServicePrincipal(final String id);

    IDeviceCollectionWithReferencesRequestBuilder memberOfAsDevice();

    IDeviceWithReferenceRequestBuilder memberOfAsDevice(final String id);

    IOrgContactCollectionWithReferencesRequestBuilder memberOfAsOrgContact();

    IOrgContactWithReferenceRequestBuilder memberOfAsOrgContact(final String id);

    IOAuth2PermissionGrantCollectionWithReferencesRequestBuilder oauth2PermissionGrants();

    IOAuth2PermissionGrantWithReferenceRequestBuilder oauth2PermissionGrants(final String id);

    IDirectoryObjectCollectionWithReferencesRequestBuilder ownedObjects();

    IDirectoryObjectWithReferenceRequestBuilder ownedObjects(final String id);

    IAppRoleAssignmentCollectionWithReferencesRequestBuilder ownedObjectsAsAppRoleAssignment();

    IAppRoleAssignmentWithReferenceRequestBuilder ownedObjectsAsAppRoleAssignment(final String id);

    IApplicationCollectionWithReferencesRequestBuilder ownedObjectsAsApplication();

    IApplicationWithReferenceRequestBuilder ownedObjectsAsApplication(final String id);

    IEndpointCollectionWithReferencesRequestBuilder ownedObjectsAsEndpoint();

    IEndpointWithReferenceRequestBuilder ownedObjectsAsEndpoint(final String id);

    IGroupCollectionWithReferencesRequestBuilder ownedObjectsAsGroup();

    IGroupWithReferenceRequestBuilder ownedObjectsAsGroup(final String id);

    IServicePrincipalCollectionWithReferencesRequestBuilder ownedObjectsAsServicePrincipal();

    IServicePrincipalWithReferenceRequestBuilder ownedObjectsAsServicePrincipal(final String id);

    IDirectoryObjectCollectionWithReferencesRequestBuilder owners();

    IDirectoryObjectWithReferenceRequestBuilder owners(final String id);

    IAppRoleAssignmentCollectionWithReferencesRequestBuilder ownersAsAppRoleAssignment();

    IAppRoleAssignmentWithReferenceRequestBuilder ownersAsAppRoleAssignment(final String id);

    IEndpointCollectionWithReferencesRequestBuilder ownersAsEndpoint();

    IEndpointWithReferenceRequestBuilder ownersAsEndpoint(final String id);

    IServicePrincipalCollectionWithReferencesRequestBuilder ownersAsServicePrincipal();

    IServicePrincipalWithReferenceRequestBuilder ownersAsServicePrincipal(final String id);

    IUserCollectionWithReferencesRequestBuilder ownersAsUser();

    IUserWithReferenceRequestBuilder ownersAsUser(final String id);

    ITokenIssuancePolicyCollectionWithReferencesRequestBuilder tokenIssuancePolicies();

    ITokenIssuancePolicyWithReferenceRequestBuilder tokenIssuancePolicies(final String id);

    ITokenLifetimePolicyCollectionWithReferencesRequestBuilder tokenLifetimePolicies();

    ITokenLifetimePolicyWithReferenceRequestBuilder tokenLifetimePolicies(final String id);

    IDirectoryObjectCollectionWithReferencesRequestBuilder transitiveMemberOf();

    IDirectoryObjectWithReferenceRequestBuilder transitiveMemberOf(final String id);

    IUserCollectionWithReferencesRequestBuilder transitiveMemberOfAsUser();

    IUserWithReferenceRequestBuilder transitiveMemberOfAsUser(final String id);

    IGroupCollectionWithReferencesRequestBuilder transitiveMemberOfAsGroup();

    IGroupWithReferenceRequestBuilder transitiveMemberOfAsGroup(final String id);

    IApplicationCollectionWithReferencesRequestBuilder transitiveMemberOfAsApplication();

    IApplicationWithReferenceRequestBuilder transitiveMemberOfAsApplication(final String id);

    IServicePrincipalCollectionWithReferencesRequestBuilder transitiveMemberOfAsServicePrincipal();

    IServicePrincipalWithReferenceRequestBuilder transitiveMemberOfAsServicePrincipal(final String id);

    IDeviceCollectionWithReferencesRequestBuilder transitiveMemberOfAsDevice();

    IDeviceWithReferenceRequestBuilder transitiveMemberOfAsDevice(final String id);

    IOrgContactCollectionWithReferencesRequestBuilder transitiveMemberOfAsOrgContact();

    IOrgContactWithReferenceRequestBuilder transitiveMemberOfAsOrgContact(final String id);
    IServicePrincipalAddKeyRequestBuilder addKey(final KeyCredential keyCredential, final PasswordCredential passwordCredential, final String proof);
    IServicePrincipalAddPasswordRequestBuilder addPassword(final PasswordCredential passwordCredential);
    IServicePrincipalRemoveKeyRequestBuilder removeKey(final java.util.UUID keyId, final String proof);
    IServicePrincipalRemovePasswordRequestBuilder removePassword(final java.util.UUID keyId);

}