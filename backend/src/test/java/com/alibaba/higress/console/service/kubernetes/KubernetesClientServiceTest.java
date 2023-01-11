package com.alibaba.higress.console.service.kubernetes;

import io.kubernetes.client.openapi.ApiException;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class KubernetesClientServiceTest {
    
    @Test
    public void kubeConfigFileListPod() throws IOException, ApiException {
        KubernetesClientService kubernetesClientService = new KubernetesClientService();
        kubernetesClientService.kubeConfigFileListPod();
    }
    
    @Test
    public void checkIstioService() throws IOException, ApiException {
        KubernetesClientService kubernetesClientService = new KubernetesClientService();
        kubernetesClientService.init();
        System.out.println(kubernetesClientService.checkIstioService());
    }
    
    @Test
    public void test() {
        String mock = "[{\"Attributes\":{\"ServiceRegistry\":\"Kubernetes\",\"Name\":\"ack-node-local-dns-admission-controller\",\"Namespace\":\"kube-system\",\"Labels\":{\"app\":\"ack-node-local-dns-admission-controller\",\"app.kubernetes.io/managed-by\":\"Helm\"},\"ExportTo\":null,\"LabelSelectors\":{\"app\":\"ack-node-local-dns-admission-controller\"},\"ClusterExternalAddresses\":{\"Addresses\":null},\"ClusterExternalPorts\":null},\"ports\":[{\"port\":443,\"protocol\":\"UnsupportedProtocol\"}],\"creationTime\":\"2022-12-14T09:55:31Z\",\"hostname\":\"ack-node-local-dns-admission-controller.kube-system.svc.cluster.local\",\"clusterVIPs\":{\"Addresses\":{\"Kubernetes\":[\"192.168.208.63\"]}},\"defaultAddress\":\"192.168.208.63\",\"Resolution\":0,\"MeshExternal\":false,\"ResourceVersion\":\"913\"},{\"Attributes\":{\"ServiceRegistry\":\"Kubernetes\",\"Name\":\"arms-prom-admin\",\"Namespace\":\"arms-prom\",\"Labels\":{\"app\":\"arms-prometheus-ack-arms-prometheus\",\"app.kubernetes.io/managed-by\":\"Helm\",\"chart\":\"ack-arms-prometheus-1.1.9\",\"heritage\":\"Helm\",\"kubernetes.io/service-name\":\"prometheus-admin\",\"release\":\"arms-prometheus\"},\"ExportTo\":null,\"LabelSelectors\":{\"app\":\"arms-prometheus-ack-arms-prometheus\"},\"ClusterExternalAddresses\":{\"Addresses\":null},\"ClusterExternalPorts\":null},\"ports\":[{\"name\":\"operator\",\"port\":9335,\"protocol\":\"UnsupportedProtocol\"}],\"creationTime\":\"2022-12-14T09:55:33Z\",\"hostname\":\"arms-prom-admin.arms-prom.svc.cluster.local\",\"clusterVIPs\":{\"Addresses\":{\"Kubernetes\":[\"192.168.20.220\"]}},\"defaultAddress\":\"192.168.20.220\",\"Resolution\":0,\"MeshExternal\":false,\"ResourceVersion\":\"982\"},{\"Attributes\":{\"ServiceRegistry\":\"Kubernetes\",\"Name\":\"arms-prom-server\",\"Namespace\":\"arms-prom\",\"Labels\":{\"app\":\"arms-prometheus-ack-arms-prometheus\",\"app.kubernetes.io/managed-by\":\"Helm\",\"chart\":\"ack-arms-prometheus-1.1.9\",\"heritage\":\"Helm\",\"kubernetes.io/service-name\":\"prometheus-server\",\"release\":\"arms-prometheus\"},\"ExportTo\":null,\"LabelSelectors\":{\"app\":\"arms-prometheus-ack-arms-prometheus\"},\"ClusterExternalAddresses\":{\"Addresses\":null},\"ClusterExternalPorts\":null},\"ports\":[{\"port\":9090,\"protocol\":\"UnsupportedProtocol\"}],\"creationTime\":\"2022-12-14T09:55:33Z\",\"hostname\":\"arms-prom-server.arms-prom.svc.cluster.local\",\"clusterVIPs\":{\"Addresses\":{\"Kubernetes\":[\"192.168.114.206\"]}},\"defaultAddress\":\"192.168.114.206\",\"Resolution\":0,\"MeshExternal\":false,\"ResourceVersion\":\"974\"},{\"Attributes\":{\"ServiceRegistry\":\"Kubernetes\",\"Name\":\"bar-service\",\"Namespace\":\"default\",\"Labels\":null,\"ExportTo\":null,\"LabelSelectors\":{\"app\":\"bar\"},\"ClusterExternalAddresses\":{\"Addresses\":null},\"ClusterExternalPorts\":null},\"ports\":[{\"port\":5678,\"protocol\":\"UnsupportedProtocol\"}],\"creationTime\":\"2022-12-20T03:02:33Z\",\"hostname\":\"bar-service.default.svc.cluster.local\",\"clusterVIPs\":{\"Addresses\":{\"Kubernetes\":[\"192.168.234.68\"]}},\"defaultAddress\":\"192.168.234.68\",\"Resolution\":0,\"MeshExternal\":false,\"ResourceVersion\":\"2061558\"},{\"Attributes\":{\"ServiceRegistry\":\"Kubernetes\",\"Name\":\"cnfs-cache-ds-service\",\"Namespace\":\"kube-system\",\"Labels\":null,\"ExportTo\":null,\"LabelSelectors\":{\"app\":\"cnfs-cache-ds\"},\"ClusterExternalAddresses\":{\"Addresses\":null},\"ClusterExternalPorts\":null},\"ports\":[{\"port\":6500,\"protocol\":\"UnsupportedProtocol\"}],\"creationTime\":\"2022-12-14T09:59:47Z\",\"hostname\":\"cnfs-cache-ds-service.kube-system.svc.cluster.local\",\"clusterVIPs\":{\"Addresses\":{\"Kubernetes\":[\"192.168.232.197\"]}},\"defaultAddress\":\"192.168.232.197\",\"Resolution\":0,\"MeshExternal\":false,\"ResourceVersion\":\"2195\"},{\"Attributes\":{\"ServiceRegistry\":\"Kubernetes\",\"Name\":\"foo-service\",\"Namespace\":\"default\",\"Labels\":null,\"ExportTo\":null,\"LabelSelectors\":{\"app\":\"foo\"},\"ClusterExternalAddresses\":{\"Addresses\":null},\"ClusterExternalPorts\":null},\"ports\":[{\"port\":5678,\"protocol\":\"UnsupportedProtocol\"}],\"creationTime\":\"2022-12-20T03:02:33Z\",\"hostname\":\"foo-service.default.svc.cluster.local\",\"clusterVIPs\":{\"Addresses\":{\"Kubernetes\":[\"192.168.80.19\"]}},\"defaultAddress\":\"192.168.80.19\",\"Resolution\":0,\"MeshExternal\":false,\"ResourceVersion\":\"2061551\"},{\"Attributes\":{\"ServiceRegistry\":\"Kubernetes\",\"Name\":\"heapster\",\"Namespace\":\"kube-system\",\"Labels\":{\"kubernetes.io/cluster-service\":\"true\",\"kubernetes.io/name\":\"metrics-server\",\"task\":\"monitoring\"},\"ExportTo\":null,\"LabelSelectors\":{\"k8s-app\":\"metrics-server\"},\"ClusterExternalAddresses\":{\"Addresses\":null},\"ClusterExternalPorts\":null},\"ports\":[{\"port\":80,\"protocol\":\"UnsupportedProtocol\"}],\"creationTime\":\"2022-12-14T09:55:28Z\",\"hostname\":\"heapster.kube-system.svc.cluster.local\",\"clusterVIPs\":{\"Addresses\":{\"Kubernetes\":[\"192.168.16.217\"]}},\"defaultAddress\":\"192.168.16.217\",\"Resolution\":0,\"MeshExternal\":false,\"ResourceVersion\":\"827\"},{\"Attributes\":{\"ServiceRegistry\":\"Kubernetes\",\"Name\":\"higress-controller\",\"Namespace\":\"higress-system\",\"Labels\":{\"app\":\"higress-controller\",\"app.kubernetes.io/managed-by\":\"Helm\",\"app.kubernetes.io/name\":\"higress-controller\",\"app.kubernetes.io/version\":\"0.5.3\",\"helm.sh/chart\":\"higress-0.5.3\",\"higress\":\"higress-controller\"},\"ExportTo\":null,\"LabelSelectors\":{\"app\":\"higress-controller\",\"higress\":\"higress-controller\"},\"ClusterExternalAddresses\":{\"Addresses\":null},\"ClusterExternalPorts\":null},\"ports\":[{\"name\":\"http\",\"port\":8888,\"protocol\":\"HTTP\"},{\"name\":\"grpc\",\"port\":15051,\"protocol\":\"GRPC\"}],\"creationTime\":\"2022-12-20T02:22:42Z\",\"hostname\":\"higress-controller.higress-system.svc.cluster.local\",\"clusterVIPs\":{\"Addresses\":{\"Kubernetes\":[\"192.168.47.93\"]}},\"defaultAddress\":\"192.168.47.93\",\"Resolution\":0,\"MeshExternal\":false,\"ResourceVersion\":\"2050172\"},{\"Attributes\":{\"ServiceRegistry\":\"Kubernetes\",\"Name\":\"higress-gateway\",\"Namespace\":\"higress-system\",\"Labels\":{\"app\":\"higress-gateway\",\"app.kubernetes.io/managed-by\":\"Helm\",\"app.kubernetes.io/name\":\"higress-gateway\",\"app.kubernetes.io/version\":\"0.5.3\",\"helm.sh/chart\":\"higress-0.5.3\",\"higress\":\"higress-system-higress-gateway\",\"service.beta.kubernetes.io/hash\":\"5b4f12d2099716cfc4bf07bb1d952eece27f46d191b06db7b25515b9\",\"service.k8s.alibaba/loadbalancer-id\":\"lb-uf6c18ezb78f5gme110na\"},\"ExportTo\":null,\"LabelSelectors\":{\"app\":\"higress-gateway\",\"higress\":\"higress-system-higress-gateway\"},\"ClusterExternalAddresses\":{\"Addresses\":{\"Kubernetes\":[\"106.14.136.199\"]}},\"ClusterExternalPorts\":null},\"ports\":[{\"name\":\"status-port\",\"port\":15021,\"protocol\":\"UnsupportedProtocol\"},{\"name\":\"http2\",\"port\":80,\"protocol\":\"HTTP2\"},{\"name\":\"https\",\"port\":443,\"protocol\":\"HTTPS\"}],\"creationTime\":\"2022-12-20T02:22:42Z\",\"hostname\":\"higress-gateway.higress-system.svc.cluster.local\",\"clusterVIPs\":{\"Addresses\":{\"Kubernetes\":[\"192.168.130.86\"]}},\"defaultAddress\":\"192.168.130.86\",\"Resolution\":0,\"MeshExternal\":false,\"ResourceVersion\":\"2050258\"},{\"Attributes\":{\"ServiceRegistry\":\"Kubernetes\",\"Name\":\"istiod\",\"Namespace\":\"istio-system\",\"Labels\":{\"app\":\"istiod\",\"app.kubernetes.io/managed-by\":\"Helm\",\"install.operator.istio.io/owning-resource\":\"unknown\",\"istio\":\"pilot\",\"istio.io/rev\":\"default\",\"operator.istio.io/component\":\"Pilot\",\"release\":\"istio\"},\"ExportTo\":null,\"LabelSelectors\":{\"app\":\"istiod\",\"istio\":\"pilot\"},\"ClusterExternalAddresses\":{\"Addresses\":null},\"ClusterExternalPorts\":null},\"ports\":[{\"name\":\"grpc-xds\",\"port\":15010,\"protocol\":\"GRPC\"},{\"name\":\"https-dns\",\"port\":15012,\"protocol\":\"HTTPS\"},{\"name\":\"https-webhook\",\"port\":443,\"protocol\":\"HTTPS\"},{\"name\":\"http-monitoring\",\"port\":15014,\"protocol\":\"HTTP\"}],\"creationTime\":\"2022-12-20T02:22:35Z\",\"hostname\":\"istiod.istio-system.svc.cluster.local\",\"clusterVIPs\":{\"Addresses\":{\"Kubernetes\":[\"192.168.54.222\"]}},\"defaultAddress\":\"192.168.54.222\",\"Resolution\":0,\"MeshExternal\":false,\"ResourceVersion\":\"2050102\"},{\"Attributes\":{\"ServiceRegistry\":\"Kubernetes\",\"Name\":\"kube-dns\",\"Namespace\":\"kube-system\",\"Labels\":{\"k8s-app\":\"kube-dns\",\"kubernetes.io/cluster-service\":\"true\",\"kubernetes.io/name\":\"KubeDNS\"},\"ExportTo\":null,\"LabelSelectors\":{\"k8s-app\":\"kube-dns\"},\"ClusterExternalAddresses\":{\"Addresses\":null},\"ClusterExternalPorts\":null},\"ports\":[{\"name\":\"dns\",\"port\":53,\"protocol\":\"UDP\"},{\"name\":\"dns-tcp\",\"port\":53,\"protocol\":\"TCP\"},{\"name\":\"metrics\",\"port\":9153,\"protocol\":\"UnsupportedProtocol\"}],\"creationTime\":\"2022-12-14T09:55:28Z\",\"hostname\":\"kube-dns.kube-system.svc.cluster.local\",\"clusterVIPs\":{\"Addresses\":{\"Kubernetes\":[\"192.168.0.10\"]}},\"defaultAddress\":\"192.168.0.10\",\"Resolution\":0,\"MeshExternal\":false,\"ResourceVersion\":\"861\"},{\"Attributes\":{\"ServiceRegistry\":\"Kubernetes\",\"Name\":\"kube-state-metrics\",\"Namespace\":\"arms-prom\",\"Labels\":{\"app.kubernetes.io/managed-by\":\"Helm\",\"k8s-app\":\"kube-state-metrics\"},\"ExportTo\":null,\"LabelSelectors\":{\"k8s-app\":\"kube-state-metrics\"},\"ClusterExternalAddresses\":{\"Addresses\":null},\"ClusterExternalPorts\":null},\"ports\":[{\"name\":\"http-metrics\",\"port\":8080,\"protocol\":\"HTTP\"},{\"name\":\"telemetry\",\"port\":8081,\"protocol\":\"UnsupportedProtocol\"}],\"creationTime\":\"2022-12-14T09:55:33Z\",\"hostname\":\"kube-state-metrics.arms-prom.svc.cluster.local\",\"clusterVIPs\":{\"Addresses\":{\"Kubernetes\":[\"192.168.81.90\"]}},\"defaultAddress\":\"192.168.81.90\",\"Resolution\":0,\"MeshExternal\":false,\"ResourceVersion\":\"978\"},{\"Attributes\":{\"ServiceRegistry\":\"Kubernetes\",\"Name\":\"kubelet\",\"Namespace\":\"kube-system\",\"Labels\":{\"k8s-app\":\"kubelet\"},\"ExportTo\":null,\"LabelSelectors\":null,\"ClusterExternalAddresses\":{\"Addresses\":null},\"ClusterExternalPorts\":null},\"ports\":[{\"name\":\"https-metrics\",\"port\":10250,\"protocol\":\"HTTPS\"}],\"creationTime\":\"2022-12-14T09:58:51Z\",\"hostname\":\"kubelet.kube-system.svc.cluster.local\",\"clusterVIPs\":{\"Addresses\":{\"Kubernetes\":[\"0.0.0.0\"]}},\"defaultAddress\":\"0.0.0.0\",\"Resolution\":2,\"MeshExternal\":false,\"ResourceVersion\":\"1824\"},{\"Attributes\":{\"ServiceRegistry\":\"Kubernetes\",\"Name\":\"kubernetes\",\"Namespace\":\"default\",\"Labels\":{\"component\":\"apiserver\",\"provider\":\"kubernetes\"},\"ExportTo\":null,\"LabelSelectors\":null,\"ClusterExternalAddresses\":{\"Addresses\":null},\"ClusterExternalPorts\":null},\"ports\":[{\"name\":\"https\",\"port\":443,\"protocol\":\"HTTPS\"}],\"creationTime\":\"2022-12-14T09:52:34Z\",\"hostname\":\"kubernetes.default.svc.cluster.local\",\"clusterVIPs\":{\"Addresses\":{\"Kubernetes\":[\"192.168.0.1\"]}},\"defaultAddress\":\"192.168.0.1\",\"Resolution\":0,\"MeshExternal\":false,\"ResourceVersion\":\"197\"},{\"Attributes\":{\"ServiceRegistry\":\"Kubernetes\",\"Name\":\"metrics-server\",\"Namespace\":\"kube-system\",\"Labels\":{\"kubernetes.io/name\":\"metrics-server\"},\"ExportTo\":null,\"LabelSelectors\":{\"k8s-app\":\"metrics-server\"},\"ClusterExternalAddresses\":{\"Addresses\":null},\"ClusterExternalPorts\":null},\"ports\":[{\"port\":443,\"protocol\":\"UnsupportedProtocol\"}],\"creationTime\":\"2022-12-14T09:55:28Z\",\"hostname\":\"metrics-server.kube-system.svc.cluster.local\",\"clusterVIPs\":{\"Addresses\":{\"Kubernetes\":[\"192.168.56.51\"]}},\"defaultAddress\":\"192.168.56.51\",\"Resolution\":0,\"MeshExternal\":false,\"ResourceVersion\":\"831\"},{\"Attributes\":{\"ServiceRegistry\":\"Kubernetes\",\"Name\":\"node-exporter\",\"Namespace\":\"arms-prom\",\"Labels\":{\"app.kubernetes.io/managed-by\":\"Helm\",\"k8s-app\":\"node-exporter\"},\"ExportTo\":null,\"LabelSelectors\":{\"app\":\"node-exporter\"},\"ClusterExternalAddresses\":{\"Addresses\":null},\"ClusterExternalPorts\":null},\"ports\":[{\"name\":\"https\",\"port\":9100,\"protocol\":\"HTTPS\"}],\"creationTime\":\"2022-12-14T09:55:33Z\",\"hostname\":\"node-exporter.arms-prom.svc.cluster.local\",\"clusterVIPs\":{\"Addresses\":{\"Kubernetes\":[\"0.0.0.0\"]}},\"defaultAddress\":\"0.0.0.0\",\"Resolution\":2,\"MeshExternal\":false,\"ResourceVersion\":\"966\"},{\"Attributes\":{\"ServiceRegistry\":\"Kubernetes\",\"Name\":\"node-gpu-exporter\",\"Namespace\":\"arms-prom\",\"Labels\":{\"app.kubernetes.io/managed-by\":\"Helm\",\"k8s-app\":\"ack-prometheus-gpu-exporter\"},\"ExportTo\":null,\"LabelSelectors\":{\"k8s-app\":\"ack-prometheus-gpu-exporter\"},\"ClusterExternalAddresses\":{\"Addresses\":null},\"ClusterExternalPorts\":null},\"ports\":[{\"name\":\"http-metrics\",\"port\":9445,\"protocol\":\"HTTP\"}],\"creationTime\":\"2022-12-14T09:55:33Z\",\"hostname\":\"node-gpu-exporter.arms-prom.svc.cluster.local\",\"clusterVIPs\":{\"Addresses\":{\"Kubernetes\":[\"192.168.147.73\"]}},\"defaultAddress\":\"192.168.147.73\",\"Resolution\":0,\"MeshExternal\":false,\"ResourceVersion\":\"969\"},{\"Attributes\":{\"ServiceRegistry\":\"Kubernetes\",\"Name\":\"storage-crd-validate-service\",\"Namespace\":\"kube-system\",\"Labels\":{\"app\":\"storage-crd-validate-service\"},\"ExportTo\":null,\"LabelSelectors\":{\"app\":\"storage-operator\"},\"ClusterExternalAddresses\":{\"Addresses\":null},\"ClusterExternalPorts\":null},\"ports\":[{\"port\":443,\"protocol\":\"UnsupportedProtocol\"}],\"creationTime\":\"2022-12-14T09:55:25Z\",\"hostname\":\"storage-crd-validate-service.kube-system.svc.cluster.local\",\"clusterVIPs\":{\"Addresses\":{\"Kubernetes\":[\"192.168.60.167\"]}},\"defaultAddress\":\"192.168.60.167\",\"Resolution\":0,\"MeshExternal\":false,\"ResourceVersion\":\"758\"},{\"Attributes\":{\"ServiceRegistry\":\"Kubernetes\",\"Name\":\"storage-monitor-service\",\"Namespace\":\"kube-system\",\"Labels\":null,\"ExportTo\":null,\"LabelSelectors\":{\"app\":\"storage-monitor\"},\"ClusterExternalAddresses\":{\"Addresses\":null},\"ClusterExternalPorts\":null},\"ports\":[{\"port\":11280,\"protocol\":\"UnsupportedProtocol\"}]}]";
        
    }
    
}