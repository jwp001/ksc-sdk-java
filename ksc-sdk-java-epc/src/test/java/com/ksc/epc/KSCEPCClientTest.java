package com.ksc.epc;

import com.ksc.epc.model.*;
import com.ksc.model.Filter;
import com.ksc.regions.InMemoryRegionImpl;
import com.ksc.regions.Region;
import org.apache.log4j.Logger;
import org.junit.Test;

import com.ksc.auth.AWSCredentials;
import com.ksc.auth.BasicAWSCredentials;

import java.util.ArrayList;

public class KSCEPCClientTest {
	private static final Logger log = Logger.getLogger(KSCEPCClientTest.class);
    @Test
    public void createEpc(){
        AWSCredentials credentials = new BasicAWSCredentials("AKLTUnpB8vY3T0SwYFGprjj_7w","OGmPbxxelZZ/94zx7yna8fjA6pEaEaeqIv6PoV6sPnFET2/fhkUaz7ZwcVOOM0NW3Q==");
        KSCEPCClient client = new KSCEPCClient(credentials);
        client.setEndpoint("http://epc.inner.api.ksyun.com");
        client.setServiceNameIntern("epc");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        CreateEpcRequest request = new CreateEpcRequest();
        request.setAvailabilityZone("cn-shanghai-3b");
        request.setImageId("2c9d8f29-6eb9-4bc7-90e5-b0bd7a9e2d3a");
        request.setKeyId("bc735eee-180c-403a-822c-7923c77f8d5d");
        request.setPassword("Test@1234");
        request.setSubnetId("8020f9ac-06ca-48cc-8821-587d0bdcde8e");
        request.addSecurityGroupIds("ab60516b-6832-408c-90b6-e9bcbdadd107");
        request.setHostName("test");
        request.setChargeType("PostPaidByDay");
        request.setRaid("Raid1");
        request.setHostType("DB");
        request.setNetworkInterfaceMode("single");
        CreateEpcResult result = client.createEpc(request);
        log.info(result);
    }

    @Test
    public void describeEpcs(){
        AWSCredentials credentials = new BasicAWSCredentials("AKLTUnpB8vY3T0SwYFGprjj_7w","OGmPbxxelZZ/94zx7yna8fjA6pEaEaeqIv6PoV6sPnFET2/fhkUaz7ZwcVOOM0NW3Q==");
        KSCEPCClient client = new KSCEPCClient(credentials);
        client.setEndpoint("http://epc.inner.api.ksyun.com");
        client.setServiceNameIntern("epc");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        DescribeEpcsRequest request = new DescribeEpcsRequest();
        DescribeEpcsResult result = client.describeEpcs(request);
        log.info(result);
    }

    @Test
    public void deleteEpc(){
        AWSCredentials credentials = new BasicAWSCredentials("AKLTUnpB8vY3T0SwYFGprjj_7w","OGmPbxxelZZ/94zx7yna8fjA6pEaEaeqIv6PoV6sPnFET2/fhkUaz7ZwcVOOM0NW3Q==");
        KSCEPCClient client = new KSCEPCClient(credentials);
        client.setEndpoint("http://epc.inner.api.ksyun.com");
        client.setServiceNameIntern("epc");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        DeleteEpcRequest request = new DeleteEpcRequest();
        request.setHostId("79cc4e31-9e3e-47c5-b2d5-d1ee5fb4e8a7");
        DeleteEpcResult result = client.deleteEpc(request);
        log.info(result);
    }

    @Test
    public void modifyEpc(){
        AWSCredentials credentials = new BasicAWSCredentials("AKLTUnpB8vY3T0SwYFGprjj_7w","OGmPbxxelZZ/94zx7yna8fjA6pEaEaeqIv6PoV6sPnFET2/fhkUaz7ZwcVOOM0NW3Q==");
        KSCEPCClient client = new KSCEPCClient(credentials);
        client.setEndpoint("http://epc.inner.api.ksyun.com");
        client.setServiceNameIntern("epc");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        ModifyEpcRequest request = new ModifyEpcRequest();
        request.setHostId("7a5b7a66-72b7-40a2-8e4b-b806ce98ddde");
        request.setHostName("test");
        ModifyEpcResult result = client.modifyEpc(request);
        log.info(result);
    }

    @Test
    public void startEpc(){
        AWSCredentials credentials = new BasicAWSCredentials("AKLTUnpB8vY3T0SwYFGprjj_7w","OGmPbxxelZZ/94zx7yna8fjA6pEaEaeqIv6PoV6sPnFET2/fhkUaz7ZwcVOOM0NW3Q==");
        KSCEPCClient client = new KSCEPCClient(credentials);
        client.setEndpoint("http://epc.inner.api.ksyun.com");
        client.setServiceNameIntern("epc");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        StartEpcRequest request = new StartEpcRequest();
        request.setHostId("7a5b7a66-72b7-40a2-8e4b-b806ce98ddde");
        StartEpcResult result = client.startEpc(request);
        log.info(result);
    }

    @Test
    public void stopEpc(){
        AWSCredentials credentials = new BasicAWSCredentials("AKLTUnpB8vY3T0SwYFGprjj_7w","OGmPbxxelZZ/94zx7yna8fjA6pEaEaeqIv6PoV6sPnFET2/fhkUaz7ZwcVOOM0NW3Q==");
        KSCEPCClient client = new KSCEPCClient(credentials);
        client.setEndpoint("http://epc.inner.api.ksyun.com");
        client.setServiceNameIntern("epc");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        StopEpcRequest request = new StopEpcRequest();
        request.setHostId("7a5b7a66-72b7-40a2-8e4b-b806ce98ddde");
        StopEpcResult result = client.stopEpc(request);
        log.info(result);
    }

    @Test
    public void rebootEpc(){
        AWSCredentials credentials = new BasicAWSCredentials("AKLTUnpB8vY3T0SwYFGprjj_7w","OGmPbxxelZZ/94zx7yna8fjA6pEaEaeqIv6PoV6sPnFET2/fhkUaz7ZwcVOOM0NW3Q==");
        KSCEPCClient client = new KSCEPCClient(credentials);
        client.setEndpoint("http://epc.inner.api.ksyun.com");
        client.setServiceNameIntern("epc");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        RebootEpcRequest request = new RebootEpcRequest();
        request.setHostId("7a5b7a66-72b7-40a2-8e4b-b806ce98ddde");
        RebootEpcResult result = client.rebootEpc(request);
        log.info(result);
    }

    @Test
    public void reinstallEpc(){
        AWSCredentials credentials = new BasicAWSCredentials("AKLTUnpB8vY3T0SwYFGprjj_7w","OGmPbxxelZZ/94zx7yna8fjA6pEaEaeqIv6PoV6sPnFET2/fhkUaz7ZwcVOOM0NW3Q==");
        KSCEPCClient client = new KSCEPCClient(credentials);
        client.setEndpoint("http://epc.inner.api.ksyun.com");
        client.setServiceNameIntern("epc");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        ReinstallEpcRequest request = new ReinstallEpcRequest();
        request.setHostId("7a5b7a66-72b7-40a2-8e4b-b806ce98ddde");
        request.setImageId("2c9d8f29-6eb9-4bc7-90e5-b0bd7a9e2d3a");
        request.setKeyId("0617edba-18fe-4a04-aed1-3b0874157b75");
        request.setPassword("Test@1234");
        request.setNetworkInterfaceMode("single");
        request.setRaid("Raid1");
        ReinstallEpcResult result = client.reinstallEpc(request);
        log.info(result);
    }

    @Test
    public void reinstallCustomerEpc(){
        AWSCredentials credentials = new BasicAWSCredentials("AKLTUnpB8vY3T0SwYFGprjj_7w","OGmPbxxelZZ/94zx7yna8fjA6pEaEaeqIv6PoV6sPnFET2/fhkUaz7ZwcVOOM0NW3Q==");
        KSCEPCClient client = new KSCEPCClient(credentials);
        client.setEndpoint("http://epc.inner.api.ksyun.com");
        client.setServiceNameIntern("epc");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        ReinstallCustomerEpcRequest request = new ReinstallCustomerEpcRequest();
        request.setHostId("7a5b7a66-72b7-40a2-8e4b-b806ce98ddde");
        request.setPath("path");
        request.setServerIp("127.0.0.1");
        ReinstallCustomerEpcResult result = client.reinstallCustomerEpc(request);
        log.info(result);
    }

    @Test
    public void resetPassword(){
        AWSCredentials credentials = new BasicAWSCredentials("AKLTUnpB8vY3T0SwYFGprjj_7w","OGmPbxxelZZ/94zx7yna8fjA6pEaEaeqIv6PoV6sPnFET2/fhkUaz7ZwcVOOM0NW3Q==");
        KSCEPCClient client = new KSCEPCClient(credentials);
        client.setEndpoint("http://epc.inner.api.ksyun.com");
        client.setServiceNameIntern("epc");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        ResetPasswordRequest request = new ResetPasswordRequest();
        request.setHostId("7a5b7a66-72b7-40a2-8e4b-b806ce98ddde");
        request.setPassword("Test@1234");
        ResetPasswordResult result = client.resetPassword(request);
        log.info(result);
    }

    @Test
    public void modifyHyperThreading(){
        AWSCredentials credentials = new BasicAWSCredentials("AKLTUnpB8vY3T0SwYFGprjj_7w","OGmPbxxelZZ/94zx7yna8fjA6pEaEaeqIv6PoV6sPnFET2/fhkUaz7ZwcVOOM0NW3Q==");
        KSCEPCClient client = new KSCEPCClient(credentials);
        client.setEndpoint("http://epc.inner.api.ksyun.com");
        client.setServiceNameIntern("epc");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        ModifyHyperThreadingRequest request = new ModifyHyperThreadingRequest();
        request.setHostId("7a5b7a66-72b7-40a2-8e4b-b806ce98ddde");
        request.setHyperThreadingStatus("stop");
        ModifyHyperThreadingResult result = client.modifyHyperThreading(request);
        log.info(result);
    }

    @Test
    public void createImage(){
        AWSCredentials credentials = new BasicAWSCredentials("AKLTUnpB8vY3T0SwYFGprjj_7w","OGmPbxxelZZ/94zx7yna8fjA6pEaEaeqIv6PoV6sPnFET2/fhkUaz7ZwcVOOM0NW3Q==");
        KSCEPCClient client = new KSCEPCClient(credentials);
        client.setEndpoint("http://epc.inner.api.ksyun.com");
        client.setServiceNameIntern("epc");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        CreateImageRequest request = new CreateImageRequest();
        request.setHostId("7a5b7a66-72b7-40a2-8e4b-b806ce98ddde");
        request.setImageName("test");
        CreateImageResult result = client.createImage(request);
        log.info(result);
    }

    @Test
    public void modifyImage(){
        AWSCredentials credentials = new BasicAWSCredentials("AKLTUnpB8vY3T0SwYFGprjj_7w","OGmPbxxelZZ/94zx7yna8fjA6pEaEaeqIv6PoV6sPnFET2/fhkUaz7ZwcVOOM0NW3Q==");
        KSCEPCClient client = new KSCEPCClient(credentials);
        client.setEndpoint("http://epc.inner.api.ksyun.com");
        client.setServiceNameIntern("epc");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        ModifyImageRequest request = new ModifyImageRequest();
        request.setImageId("prt2161ba80-adc6-4d9b-b106-e80864356022");
        request.setImageName("test");

        ModifyImageResult result = client.modifyImage(request);
        log.info(result);
    }

    @Test
    public void deleteImage(){
        AWSCredentials credentials = new BasicAWSCredentials("AKLTUnpB8vY3T0SwYFGprjj_7w","OGmPbxxelZZ/94zx7yna8fjA6pEaEaeqIv6PoV6sPnFET2/fhkUaz7ZwcVOOM0NW3Q==");
        KSCEPCClient client = new KSCEPCClient(credentials);
        client.setEndpoint("http://epc.inner.api.ksyun.com");
        client.setServiceNameIntern("epc");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        DeleteImageRequest request = new DeleteImageRequest();
        request.setImageId("prt295a5e7d-1ada-44e8-b5a5-28d081db138f");
        DeleteImageResult result = client.deleteImage(request);
        log.info(result);
    }

    @Test
    public void describeImages(){
        AWSCredentials credentials = new BasicAWSCredentials("AKLTUnpB8vY3T0SwYFGprjj_7w","OGmPbxxelZZ/94zx7yna8fjA6pEaEaeqIv6PoV6sPnFET2/fhkUaz7ZwcVOOM0NW3Q==");
        KSCEPCClient client = new KSCEPCClient(credentials);
        client.setEndpoint("http://epc.inner.api.ksyun.com");
        client.setServiceNameIntern("epc");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        DescribeImagesRequest request = new DescribeImagesRequest();
        DescribeImagesResult result = client.describeImages(request);
        log.info(result);
    }

    @Test
    public void importKey(){
        AWSCredentials credentials = new BasicAWSCredentials("AKLTUnpB8vY3T0SwYFGprjj_7w","OGmPbxxelZZ/94zx7yna8fjA6pEaEaeqIv6PoV6sPnFET2/fhkUaz7ZwcVOOM0NW3Q==");
        KSCEPCClient client = new KSCEPCClient(credentials);
        client.setEndpoint("http://epc.inner.api.ksyun.com");
        client.setServiceNameIntern("epc");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        ImportKeyRequest request = new ImportKeyRequest();
        request.setKeyName("test");
        request.setPublicKey("ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAAAgQCqh1HPJxWrJnnl+jnjyGtop2oKC6rynwnRgdk8hNSTG7qeR67Css9VzfxMcA//gL6y0zbR3xETuMh19KQqYBcutT96IBLJ7UUZMdaYfse8+WLqkZ+lktukDQbEku6ayMi4dJxJoUJYLuH79WgSdlMLrzbGaFkttq0K9mRLDKcu4Q== root");
        ImportKeyResult result = client.importKey(request);
        log.info(result);
    }

    @Test
    public void deleteKey(){
        AWSCredentials credentials = new BasicAWSCredentials("AKLTUnpB8vY3T0SwYFGprjj_7w","OGmPbxxelZZ/94zx7yna8fjA6pEaEaeqIv6PoV6sPnFET2/fhkUaz7ZwcVOOM0NW3Q==");
        KSCEPCClient client = new KSCEPCClient(credentials);
        client.setEndpoint("http://epc.inner.api.ksyun.com");
        client.setServiceNameIntern("epc");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        DeleteKeyRequest request = new DeleteKeyRequest();
        request.setKeyId("a706f4e1-2565-41cb-aeec-a960a7eb8840");
        DeleteKeyResult result = client.deleteKey(request);
        log.info(result);
    }

    @Test
    public void modifyKey(){
        AWSCredentials credentials = new BasicAWSCredentials("AKLTUnpB8vY3T0SwYFGprjj_7w","OGmPbxxelZZ/94zx7yna8fjA6pEaEaeqIv6PoV6sPnFET2/fhkUaz7ZwcVOOM0NW3Q==");
        KSCEPCClient client = new KSCEPCClient(credentials);
        client.setEndpoint("http://epc.inner.api.ksyun.com");
        client.setServiceNameIntern("epc");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        ModifyKeyRequest request = new ModifyKeyRequest();
        request.setKeyId("a706f4e1-2565-41cb-aeec-a960a7eb8840");
        request.setKeyName("test-test");
        ModifyKeyResult result = client.modifyKey(request);
        log.info(result);
    }

    @Test
    public void createKey(){
        AWSCredentials credentials = new BasicAWSCredentials("AKLTUnpB8vY3T0SwYFGprjj_7w","OGmPbxxelZZ/94zx7yna8fjA6pEaEaeqIv6PoV6sPnFET2/fhkUaz7ZwcVOOM0NW3Q==");
        KSCEPCClient client = new KSCEPCClient(credentials);
        client.setEndpoint("http://epc.inner.api.ksyun.com");
        client.setServiceNameIntern("epc");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        CreateKeyRequest request = new CreateKeyRequest();
        request.setKeyName("test");
        CreateKeyResult result = client.createKey(request);
        log.info(result);
    }

    @Test
    public void describeKeys(){
        AWSCredentials credentials = new BasicAWSCredentials("AKLTUnpB8vY3T0SwYFGprjj_7w","OGmPbxxelZZ/94zx7yna8fjA6pEaEaeqIv6PoV6sPnFET2/fhkUaz7ZwcVOOM0NW3Q==");
        KSCEPCClient client = new KSCEPCClient(credentials);
        client.setEndpoint("http://epc.inner.api.ksyun.com");
        client.setServiceNameIntern("epc");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        DescribeKeysRequest request = new DescribeKeysRequest();
        request.addKeyIds("9c6d2f25-1e9d-4793-8ba9-642ca6572185");
        DescribeKeysResult result = client.describeKeys(request);
        log.info(result);
    }

    @Test
    public void describePhysicalMonitor(){
        AWSCredentials credentials = new BasicAWSCredentials("AKLTUnpB8vY3T0SwYFGprjj_7w","OGmPbxxelZZ/94zx7yna8fjA6pEaEaeqIv6PoV6sPnFET2/fhkUaz7ZwcVOOM0NW3Q==");
        KSCEPCClient client = new KSCEPCClient(credentials);
        client.setEndpoint("http://epc.inner.api.ksyun.com");
        client.setServiceNameIntern("epc");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        DescribePhysicalMonitorRequest request = new DescribePhysicalMonitorRequest();
        request.setHostId("7a5b7a66-72b7-40a2-8e4b-b806ce98ddde");
        DescribePhysicalMonitorResult result = client.describePhysicalMonitor(request);
        log.info(result);
    }

    @Test
    public void modifyNetworkInterfaceAttribute(){
        AWSCredentials credentials = new BasicAWSCredentials("AKLTUnpB8vY3T0SwYFGprjj_7w","OGmPbxxelZZ/94zx7yna8fjA6pEaEaeqIv6PoV6sPnFET2/fhkUaz7ZwcVOOM0NW3Q==");
        KSCEPCClient client = new KSCEPCClient(credentials);
        client.setEndpoint("http://epc.inner.api.ksyun.com");
        client.setServiceNameIntern("epc");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        ModifyNetworkInterfaceAttributeRequest request = new ModifyNetworkInterfaceAttributeRequest();
        request.setHostId("7a5b7a66-72b7-40a2-8e4b-b806ce98ddde");
        request.setNetworkInterfaceId("7a5b7a66-72b7-40a2-8e4b-b806ce98ddde");
        request.setSubnetId("8020f9ac-06ca-48cc-8821-587d0bdcde8e");
        request.addSecurityGroupIds("ab60516b-6832-408c-90b6-e9bcbdadd107");
        ModifyNetworkInterfaceAttributeResult result = client.modifyNetworkInterfaceAttribute(request);
        log.info(result);
    }

    @Test
    public void modifyDns(){
        AWSCredentials credentials = new BasicAWSCredentials("AKLTUnpB8vY3T0SwYFGprjj_7w","OGmPbxxelZZ/94zx7yna8fjA6pEaEaeqIv6PoV6sPnFET2/fhkUaz7ZwcVOOM0NW3Q==");
        KSCEPCClient client = new KSCEPCClient(credentials);
        client.setEndpoint("http://epc.inner.api.ksyun.com");
        client.setServiceNameIntern("epc");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        ModifyDnsRequest request = new ModifyDnsRequest();
        request.setHostId("7a5b7a66-72b7-40a2-8e4b-b806ce98ddde");
        request.setNetworkInterfaceId("7a5b7a66-72b7-40a2-8e4b-b806ce98ddde");
        request.setDNS1("198.18.224.12");
        ModifyDnsResult result = client.modifyDns(request);
        log.info(result);
    }

    @Test
    public void modifySecurityGroup(){
        AWSCredentials credentials = new BasicAWSCredentials("AKLTUnpB8vY3T0SwYFGprjj_7w","OGmPbxxelZZ/94zx7yna8fjA6pEaEaeqIv6PoV6sPnFET2/fhkUaz7ZwcVOOM0NW3Q==");
        KSCEPCClient client = new KSCEPCClient(credentials);
        client.setEndpoint("http://epc.inner.api.ksyun.com");
        client.setServiceNameIntern("epc");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        ModifySecurityGroupRequest request = new ModifySecurityGroupRequest();
        request.setHostId("7a5b7a66-72b7-40a2-8e4b-b806ce98ddde");
        request.setNetworkInterfaceId("7a5b7a66-72b7-40a2-8e4b-b806ce98ddde");
        request.addSecurityGroupIds("ab60516b-6832-408c-90b6-e9bcbdadd107");
        ModifySecurityGroupResult result = client.modifySecurityGroup(request);
        log.info(result);
    }

    @Test
    public void describeCabinets(){
        AWSCredentials credentials = new BasicAWSCredentials("AKLTUnpB8vY3T0SwYFGprjj_7w","OGmPbxxelZZ/94zx7yna8fjA6pEaEaeqIv6PoV6sPnFET2/fhkUaz7ZwcVOOM0NW3Q==");
        KSCEPCClient client = new KSCEPCClient(credentials);
        client.setEndpoint("http://epc.inner.api.ksyun.com");
        client.setServiceNameIntern("epc");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        DescribeCabinetsRequest request = new DescribeCabinetsRequest();
        DescribeCabinetsResult result = client.describeCabinets(request);
        log.info(result);
    }

    @Test
    public void describeInspections(){
        AWSCredentials credentials = new BasicAWSCredentials("AKLTUnpB8vY3T0SwYFGprjj_7w","OGmPbxxelZZ/94zx7yna8fjA6pEaEaeqIv6PoV6sPnFET2/fhkUaz7ZwcVOOM0NW3Q==");
        KSCEPCClient client = new KSCEPCClient(credentials);
        client.setEndpoint("http://epc.inner.api.ksyun.com");
        client.setServiceNameIntern("epc");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        DescribeInspectionsRequest request = new DescribeInspectionsRequest();
        DescribeInspectionsResult result = client.describeInspections(request);
        log.info(result);
    }

    @Test
    public void describeEpcStocks(){
        AWSCredentials credentials = new BasicAWSCredentials("AKLTUnpB8vY3T0SwYFGprjj_7w","OGmPbxxelZZ/94zx7yna8fjA6pEaEaeqIv6PoV6sPnFET2/fhkUaz7ZwcVOOM0NW3Q==");
        KSCEPCClient client = new KSCEPCClient(credentials);
        client.setEndpoint("http://epc.inner.api.ksyun.com");
        client.setServiceNameIntern("epc");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        DescribeEpcStocksRequest request = new DescribeEpcStocksRequest();
        DescribeEpcStocksResult result = client.describeEpcStocks(request);
        log.info(result);
    }


    @Test
    public void describeEpcDeviceAttributes(){
        AWSCredentials credentials = new BasicAWSCredentials("AKLTUnpB8vY3T0SwYFGprjj_7w","OGmPbxxelZZ/94zx7yna8fjA6pEaEaeqIv6PoV6sPnFET2/fhkUaz7ZwcVOOM0NW3Q==");
        KSCEPCClient client = new KSCEPCClient(credentials);
        client.setEndpoint("http://epc.inner.api.ksyun.com");
        client.setServiceNameIntern("epc");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        DescribeEpcDeviceAttributesRequest request = new DescribeEpcDeviceAttributesRequest();
        DescribeEpcDeviceAttributesResult result = client.describeEpcDeviceAttributes(request);
        log.info(result);
    }

    @Test
    public void describeEpcTrashes(){
        AWSCredentials credentials = new BasicAWSCredentials("AKLTUnpB8vY3T0SwYFGprjj_7w","OGmPbxxelZZ/94zx7yna8fjA6pEaEaeqIv6PoV6sPnFET2/fhkUaz7ZwcVOOM0NW3Q==");
        KSCEPCClient client = new KSCEPCClient(credentials);
        client.setEndpoint("http://epc.inner.api.ksyun.com");
        client.setServiceNameIntern("epc");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        DescribeEpcTrashesRequest request = new DescribeEpcTrashesRequest();
        DescribeEpcTrashesResult result = client.describeEpcTrashes(request);
        log.info(result);
    }

    @Test
    public void returnEpc(){
        KSCEPCClient client = new KSCEPCClient();
        client.setEndpoint("http://epc.inner.api.ksyun.com");
        client.setServiceNameIntern("epc");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        ReturnEpcRequest request = new ReturnEpcRequest();
        ReturnEpcResult result = client.returnEpc(request);
        log.info(result);
    }

    @Test
    public void recoverEpc(){
        KSCEPCClient client = new KSCEPCClient();
        client.setEndpoint("http://epc.inner.api.ksyun.com");
        client.setServiceNameIntern("epc");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        RecoverEpcRequest request = new RecoverEpcRequest();
        RecoverEpcResult result = client.recoverEpc(request);
        log.info(result);
    }

    @Test
    public void describePrice(){
        AWSCredentials credentials = new BasicAWSCredentials("AKLTUnpB8vY3T0SwYFGprjj_7w","OGmPbxxelZZ/94zx7yna8fjA6pEaEaeqIv6PoV6sPnFET2/fhkUaz7ZwcVOOM0NW3Q==");
        KSCEPCClient client = new KSCEPCClient(credentials);
        client.setEndpoint("http://epc.inner.api.ksyun.com");
        client.setServiceNameIntern("epc");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        DescribePriceRequest request = new DescribePriceRequest();
        request.setHostType("DB");
        request.setAvailabilityZone("cn-shanghai-3b");
        request.setChargeType("Daily");
        request.setAmount(1);
        DescribePriceResult result = client.describePrice(request);
        log.info(result);
    }

    @Test
    public void describeAccessorys(){
        AWSCredentials credentials = new BasicAWSCredentials("AKLTUnpB8vY3T0SwYFGprjj_7w","OGmPbxxelZZ/94zx7yna8fjA6pEaEaeqIv6PoV6sPnFET2/fhkUaz7ZwcVOOM0NW3Q==");
        KSCEPCClient client = new KSCEPCClient(credentials);
        client.setEndpoint("http://epc.inner.api.ksyun.com");
        client.setServiceNameIntern("epc");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        DescribeAccessorysRequest request = new DescribeAccessorysRequest();
        DescribeAccessorysResult result = client.describeAccessorys(request);
        log.info(result);
    }

    @Test
    public void deleteAccessory(){
        AWSCredentials credentials = new BasicAWSCredentials("AKLTUnpB8vY3T0SwYFGprjj_7w","OGmPbxxelZZ/94zx7yna8fjA6pEaEaeqIv6PoV6sPnFET2/fhkUaz7ZwcVOOM0NW3Q==");
        KSCEPCClient client = new KSCEPCClient(credentials);
        client.setEndpoint("http://epc.inner.api.ksyun.com");
        client.setServiceNameIntern("epc");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        DeleteAccessoryRequest request = new DeleteAccessoryRequest();
        request.setAccessoryId("dd4b9ff7-e24f-4097-a7c4-69a9ed442e7a");
        DeleteAccessoryResult result = client.deleteAccessory(request);
        log.info(result);
    }


    @Test
    public void createAccessory(){
        AWSCredentials credentials = new BasicAWSCredentials("AKLTUnpB8vY3T0SwYFGprjj_7w","OGmPbxxelZZ/94zx7yna8fjA6pEaEaeqIv6PoV6sPnFET2/fhkUaz7ZwcVOOM0NW3Q==");
        KSCEPCClient client = new KSCEPCClient(credentials);
        client.setEndpoint("http://epc.inner.api.ksyun.com");
        client.setServiceNameIntern("epc");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        CreateAccessoryRequest request = new CreateAccessoryRequest();
        request.setAccessoryName("test");
        request.setAccessorySuit("Sas-300GB");
        request.setAccessoryType("Sas");
        request.setAvailabilityZone("cn-shanghai-3b");
        request.setChargeType("PostPaidByDay");
        CreateAccessoryResult result = client.createAccessory(request);
        log.info(result);
    }

    @Test
    public void buyAccessory(){
        AWSCredentials credentials = new BasicAWSCredentials("AKLTUnpB8vY3T0SwYFGprjj_7w","OGmPbxxelZZ/94zx7yna8fjA6pEaEaeqIv6PoV6sPnFET2/fhkUaz7ZwcVOOM0NW3Q==");
        KSCEPCClient client = new KSCEPCClient(credentials);
        client.setEndpoint("http://epc.inner.api.ksyun.com");
        client.setServiceNameIntern("epc");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        BuyAccessoryRequest request = new BuyAccessoryRequest();
        request.setAccessoryName("test");
        request.setAccessorySuit("Sas-300GB");
        request.setAccessoryType("Sas");
        request.setAvailabilityZone("cn-shanghai-3b");
        request.setChargeType("PrepaidByTime");
        BuyAccessoryResult result = client.buyAccessory(request);
        log.info(result);
    }

    @Test
    public void createCabinet(){
        AWSCredentials credentials = new BasicAWSCredentials("AKLTUnpB8vY3T0SwYFGprjj_7w","OGmPbxxelZZ/94zx7yna8fjA6pEaEaeqIv6PoV6sPnFET2/fhkUaz7ZwcVOOM0NW3Q==");
        KSCEPCClient client = new KSCEPCClient(credentials);
        client.setEndpoint("http://epc.inner.api.ksyun.com");
        client.setServiceNameIntern("epc");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        CreateCabinetRequest request = new CreateCabinetRequest();
        request.setAvailabilityZone("cn-shanghai-3b");
        request.setCabinetType("Reserved");
        request.setChargeType("PostPaidByDay");
        CreateCabinetResult result = client.createCabinet(request);
        log.info(result);
    }

    @Test
    public void describeProcesses(){
        AWSCredentials credentials = new BasicAWSCredentials("AKLTUnpB8vY3T0SwYFGprjj_7w","OGmPbxxelZZ/94zx7yna8fjA6pEaEaeqIv6PoV6sPnFET2/fhkUaz7ZwcVOOM0NW3Q==");
        KSCEPCClient client = new KSCEPCClient(credentials);
        client.setEndpoint("http://epc.inner.api.ksyun.com");
        client.setServiceNameIntern("epc");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        DescribeProcessesRequest request = new DescribeProcessesRequest();
        DescribeProcessesResult result = client.describeProcesses(request);
        log.info(result);
    }

    @Test
    public void createProcess(){
        AWSCredentials credentials = new BasicAWSCredentials("AKLTUnpB8vY3T0SwYFGprjj_7w","OGmPbxxelZZ/94zx7yna8fjA6pEaEaeqIv6PoV6sPnFET2/fhkUaz7ZwcVOOM0NW3Q==");
        KSCEPCClient client = new KSCEPCClient(credentials);
        client.setEndpoint("http://epc.inner.api.ksyun.com");
        client.setServiceNameIntern("epc");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        CreateProcessRequest request = new CreateProcessRequest();
        request.setProcessId("test");
        request.setTitle("test");
        request.setAttribute("Network");
        request.setAvailabilityZone("cn-shanghai-3b");
        request.setConfirm("0");
        request.setContent("test");
        request.setSn("test-2-448");
        request.setType("fix");
        CreateProcessResult result = client.createProcess(request);
        log.info(result);
    }

    @Test
    public void deleteProcess(){
        AWSCredentials credentials = new BasicAWSCredentials("AKLTUnpB8vY3T0SwYFGprjj_7w","OGmPbxxelZZ/94zx7yna8fjA6pEaEaeqIv6PoV6sPnFET2/fhkUaz7ZwcVOOM0NW3Q==");
        KSCEPCClient client = new KSCEPCClient(credentials);
        client.setEndpoint("http://epc.inner.api.ksyun.com");
        client.setServiceNameIntern("epc");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        DeleteProcessRequest request = new DeleteProcessRequest();
        request.setOperationProcessId("442c59f1-de1c-4cb2-be1a-190fb7434e0d");
        DeleteProcessResult result = client.deleteProcess(request);
        log.info(result);
    }

    @Test
    public void replyProcess(){
        AWSCredentials credentials = new BasicAWSCredentials("AKLTUnpB8vY3T0SwYFGprjj_7w","OGmPbxxelZZ/94zx7yna8fjA6pEaEaeqIv6PoV6sPnFET2/fhkUaz7ZwcVOOM0NW3Q==");
        KSCEPCClient client = new KSCEPCClient(credentials);
        client.setEndpoint("http://epc.inner.api.ksyun.com");
        client.setServiceNameIntern("epc");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        ReplyProcessRequest request = new ReplyProcessRequest();
        request.setOperationProcessId("442c59f1-de1c-4cb2-be1a-190fb7434e0d");
        request.setRemarks("test");
        ReplyProcessResult result = client.replyProcess(request);
        log.info(result);
    }

    @Test
    public void createRemoteManagement(){
        AWSCredentials credentials = new BasicAWSCredentials("AKLTUnpB8vY3T0SwYFGprjj_7w","OGmPbxxelZZ/94zx7yna8fjA6pEaEaeqIv6PoV6sPnFET2/fhkUaz7ZwcVOOM0NW3Q==");
        KSCEPCClient client = new KSCEPCClient(credentials);
        client.setEndpoint("http://epc.inner.api.ksyun.com");
        client.setServiceNameIntern("epc");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        CreateRemoteManagementRequest request = new CreateRemoteManagementRequest();
        request.setName("eeeeee");
        request.setPhoneNumber("11111111111");
        request.setPin("123456");
        CreateRemoteManagementResult result = client.createRemoteManagement(request);
        log.info(result);
    }

    @Test
    public void getDynamicCode(){
        AWSCredentials credentials = new BasicAWSCredentials("AKLTUnpB8vY3T0SwYFGprjj_7w","OGmPbxxelZZ/94zx7yna8fjA6pEaEaeqIv6PoV6sPnFET2/fhkUaz7ZwcVOOM0NW3Q==");
        KSCEPCClient client = new KSCEPCClient(credentials);
        client.setEndpoint("http://epc.inner.api.ksyun.com");
        client.setServiceNameIntern("epc");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        GetDynamicCodeRequest request = new GetDynamicCodeRequest();
        request.setRemoteManagementId("a96d5a74-005f-4212-88c7-b1ce6328fbfc");
        GetDynamicCodeResult result = client.getDynamicCode(request);
        log.info(result);
    }

    @Test
    public void describeRemoteManagements(){
        AWSCredentials credentials = new BasicAWSCredentials("AKLTUnpB8vY3T0SwYFGprjj_7w","OGmPbxxelZZ/94zx7yna8fjA6pEaEaeqIv6PoV6sPnFET2/fhkUaz7ZwcVOOM0NW3Q==");
        KSCEPCClient client = new KSCEPCClient(credentials);
        client.setEndpoint("http://epc.inner.api.ksyun.com");
        client.setServiceNameIntern("epc");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        DescribeRemoteManagementsRequest request = new DescribeRemoteManagementsRequest();
        DescribeRemoteManagementsResult result = client.describeRemoteManagements(request);
        log.info(result);
    }

    @Test
    public void modifyRemoteManagement(){
        AWSCredentials credentials = new BasicAWSCredentials("AKLTUnpB8vY3T0SwYFGprjj_7w","OGmPbxxelZZ/94zx7yna8fjA6pEaEaeqIv6PoV6sPnFET2/fhkUaz7ZwcVOOM0NW3Q==");
        KSCEPCClient client = new KSCEPCClient(credentials);
        client.setEndpoint("http://epc.inner.api.ksyun.com");
        client.setServiceNameIntern("epc");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        ModifyRemoteManagementRequest request = new ModifyRemoteManagementRequest();
        request.setRemoteManagementId("d7d6c4d5-4fb7-4caf-8144-74822173020f");
        request.setName("test-test");
        ModifyRemoteManagementResult result = client.modifyRemoteManagement(request);
        log.info(result);
    }

    @Test
    public void deleteRemoteManagement(){
        AWSCredentials credentials = new BasicAWSCredentials("AKLTUnpB8vY3T0SwYFGprjj_7w","OGmPbxxelZZ/94zx7yna8fjA6pEaEaeqIv6PoV6sPnFET2/fhkUaz7ZwcVOOM0NW3Q==");
        KSCEPCClient client = new KSCEPCClient(credentials);
        client.setEndpoint("http://epc.inner.api.ksyun.com");
        client.setServiceNameIntern("epc");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        DeleteRemoteManagementRequest request = new DeleteRemoteManagementRequest();
        request.setRemoteManagementId("d7d6c4d5-4fb7-4caf-8144-74822173020f");
        DeleteRemoteManagementResult result = client.deleteRemoteManagement(request);
        log.info(result);
    }

    @Test
    public void describeEpcManagements(){
        AWSCredentials credentials = new BasicAWSCredentials("AKLTUnpB8vY3T0SwYFGprjj_7w","OGmPbxxelZZ/94zx7yna8fjA6pEaEaeqIv6PoV6sPnFET2/fhkUaz7ZwcVOOM0NW3Q==");
        KSCEPCClient client = new KSCEPCClient(credentials);
        client.setEndpoint("http://epc.inner.api.ksyun.com");
        client.setServiceNameIntern("epc");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        DescribeEpcManagementsRequest request = new DescribeEpcManagementsRequest();
        DescribeEpcManagementsResult result = client.describeEpcManagements(request);
        log.info(result);
    }

    @Test
    public void describeVpns(){
        AWSCredentials credentials = new BasicAWSCredentials("AKLTUnpB8vY3T0SwYFGprjj_7w","OGmPbxxelZZ/94zx7yna8fjA6pEaEaeqIv6PoV6sPnFET2/fhkUaz7ZwcVOOM0NW3Q==");
        KSCEPCClient client = new KSCEPCClient(credentials);
        client.setEndpoint("http://epc.inner.api.ksyun.com");
        client.setServiceNameIntern("epc");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        DescribeVpnsRequest request = new DescribeVpnsRequest();
        request.setRemoteManagementId("a96d5a74-005f-4212-88c7-b1ce6328fbfc");
        request.setDynamicCode("111111");
        request.setPin("123456");
        DescribeVpnsResult result = client.describeVpns(request);
        log.info(result);
    }

    @Test
    public void createResourceRequirement(){
        AWSCredentials credentials = new BasicAWSCredentials("AKLTUnpB8vY3T0SwYFGprjj_7w","OGmPbxxelZZ/94zx7yna8fjA6pEaEaeqIv6PoV6sPnFET2/fhkUaz7ZwcVOOM0NW3Q==");
        KSCEPCClient client = new KSCEPCClient(credentials);
        client.setEndpoint("http://epc.inner.api.ksyun.com");
        client.setServiceNameIntern("epc");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        CreateResourceRequirementRequest request = new CreateResourceRequirementRequest();
        request.setAvailabilityZone("cn-shanghai-3b");
        request.setHostType("DB");
        request.setProjectName("test");
        request.setRequirementCount(1);
        request.setUsageDate("20201105");
        request.setDescription("test");
        CreateResourceRequirementResult result = client.createResourceRequirement(request);
        log.info(result);
    }

    @Test
    public void modifyResourceRequirement(){
        AWSCredentials credentials = new BasicAWSCredentials("AKLTUnpB8vY3T0SwYFGprjj_7w","OGmPbxxelZZ/94zx7yna8fjA6pEaEaeqIv6PoV6sPnFET2/fhkUaz7ZwcVOOM0NW3Q==");
        KSCEPCClient client = new KSCEPCClient(credentials);
        client.setEndpoint("http://epc.inner.api.ksyun.com");
        client.setServiceNameIntern("epc");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        ModifyResourceRequirementRequest request = new ModifyResourceRequirementRequest();
        request.setProjectName("test-test");
        request.setDescription("test-test");
        request.setResourceRequirementId("2517d5f9-cbee-4906-8aa3-1673bd867f19");
        ModifyResourceRequirementResult result = client.modifyResourceRequirement(request);
        log.info(result);
    }

    @Test
    public void deleteResourceRequirement(){
        AWSCredentials credentials = new BasicAWSCredentials("AKLTUnpB8vY3T0SwYFGprjj_7w","OGmPbxxelZZ/94zx7yna8fjA6pEaEaeqIv6PoV6sPnFET2/fhkUaz7ZwcVOOM0NW3Q==");
        KSCEPCClient client = new KSCEPCClient(credentials);        client.setEndpoint("http://epc.inner.api.ksyun.com");
        client.setServiceNameIntern("epc");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        DeleteResourceRequirementRequest request = new DeleteResourceRequirementRequest();
        request.setResourceRequirementId("2517d5f9-cbee-4906-8aa3-1673bd867f19");
        DeleteResourceRequirementResult result = client.deleteResourceRequirement(request);
        log.info(result);
    }

    @Test
    public void describeResourceRequirements(){
        AWSCredentials credentials = new BasicAWSCredentials("AKLTUnpB8vY3T0SwYFGprjj_7w","OGmPbxxelZZ/94zx7yna8fjA6pEaEaeqIv6PoV6sPnFET2/fhkUaz7ZwcVOOM0NW3Q==");
        KSCEPCClient client = new KSCEPCClient(credentials);
        client.setEndpoint("http://epc.inner.api.ksyun.com");
        client.setServiceNameIntern("epc");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        DescribeResourceRequirementsRequest request = new DescribeResourceRequirementsRequest();
        request.addResourceRequirementIds("2517d5f9-cbee-4906-8aa3-1673bd867f19");
        DescribeResourceRequirementsResult result = client.describeResourceRequirements(request);
        log.info(result);
    }

    @Test
    public void replyResourceRequirement(){
        AWSCredentials credentials = new BasicAWSCredentials("AKLTUnpB8vY3T0SwYFGprjj_7w","OGmPbxxelZZ/94zx7yna8fjA6pEaEaeqIv6PoV6sPnFET2/fhkUaz7ZwcVOOM0NW3Q==");
        KSCEPCClient client = new KSCEPCClient(credentials);
        client.setEndpoint("http://epc.inner.api.ksyun.com");
        client.setServiceNameIntern("epc");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        ReplyResourceRequirementRequest request = new ReplyResourceRequirementRequest();
        request.setResourceRequirementId("2517d5f9-cbee-4906-8aa3-1673bd867f19");
        request.setRemarks("test");
        ReplyResourceRequirementResult result = client.replyResourceRequirement(request);
        log.info(result);
    }
}
